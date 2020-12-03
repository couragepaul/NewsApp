package com.example.newsapp.activities.ui.stub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.Info.Info;
import com.example.newsapp.R;
import com.example.newsapp.Remote.APIInterface;
import com.example.newsapp.Remote.RetrofitClient;
import com.example.newsapp.action.DialogType;
import com.example.newsapp.activities.ui.content_package.ContentPackageFragment;
import com.example.newsapp.adapter.RecyclerViewAdapter;
import com.example.newsapp.db.table.ListItemTable;
import com.example.newsapp.models.ListItemModel;
import com.example.newsapp.models.News;
import com.example.newsapp.ui.CustomDialog;
import com.example.newsapp.utils.InternetConnection;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StubFragment extends Fragment implements Info {


    public static RecyclerViewAdapter recyclerViewAdapter;
    public static RecyclerView recyclerView;
    int page = 1;
    int limit = 3;
    APIInterface apiInterface;
    String TAG = "///";
    private StubViewModel stubViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        stubViewModel =
                new ViewModelProvider(this).get(StubViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerView = root.findViewById(R.id.recycler_view);
        stubViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                RecyclerView.LayoutManager rlm = new LinearLayoutManager(getActivity());
                recyclerView.setLayoutManager(rlm);

                apiInterface = RetrofitClient.getInstance().create(APIInterface.class);
                Call<List<ListItemModel>> object = apiInterface.getData(page, limit);

                getData(object);

                ContentPackageFragment.MyBroadcastReceiver myBroadcastReceiver = new ContentPackageFragment.MyBroadcastReceiver();

                IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
                filter.addAction(OFFLINE_BUTTON_PRESSED);
                getActivity().registerReceiver(myBroadcastReceiver, filter);
            }
        });
        return root;
    }

    private void getData(Call<List<ListItemModel>> call) {
        if (InternetConnection.isConnectingToInternet(getActivity())) {

            call.enqueue(new Callback<List<ListItemModel>>() {
                @Override
                public void onResponse(Call<List<ListItemModel>> call, Response<List<ListItemModel>> response) {
                    if (!response.isSuccessful()) {
                        Toast.makeText(getActivity(), "Unsuccessful", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    ListItemTable listItemTable = new ListItemTable(getActivity());
                    try {
                        listItemTable.deleteALL();
                        Log.i(TAG, "onResponse: Deleted");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    Log.i(TAG, "onResponse: " + response.body());

                    List<ListItemModel> listItems = response.body();

                    ArrayList<ListItemModel> listItemModels = new ArrayList<>();


                    for (ListItemModel listItemModel : listItems) {
                        Log.i(TAG, "onResponse: " + listItemModel.getTitle());
                        if (listItemModel.getType().equals(STUB))
                            listItemModels.add(listItemModel);
                    }

                    if (listItemModels.isEmpty()){
                        Toast.makeText(getActivity(), "Not Found Any", Toast.LENGTH_SHORT).show();
                    }

                    recyclerViewAdapter = new RecyclerViewAdapter(getActivity(), listItemModels);
                    recyclerView.setAdapter(recyclerViewAdapter);

                }

                @Override
                public void onFailure(Call<List<ListItemModel>> call, Throwable t) {

                }

            });
        } else {
            CustomDialog.showGeneralDialog(getActivity(), getString(R.string.network),
                    getString(R.string.no_internet), DialogType.INFO, null);
        }

    }

    public static class MyBroadcastReceiver extends BroadcastReceiver {
        private static final String TAG = "MyBroadcastReceiver";

        @Override
        public void onReceive(Context context, Intent intent) {

            ListItemTable listItemTable = new ListItemTable(context);

            List<News> listItems = listItemTable.getOfflineNews();

            ArrayList<News> listItemModels = new ArrayList<>();

            for (News listItemModel : listItems) {
                Log.i(TAG, "onResponse: " + listItemModel.getHeadline());
                if (listItemModel.getType().equals(STUB))
                    listItemModels.add(listItemModel);
            }
            if (listItemModels.isEmpty()){
                Toast.makeText(context, "Not Found Any", Toast.LENGTH_SHORT).show();
            }
            recyclerViewAdapter = new RecyclerViewAdapter(context, listItemModels, true);
            recyclerView.setAdapter(recyclerViewAdapter);

        }
    }

}