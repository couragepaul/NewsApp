package com.example.newsapp.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.Info.Info;
import com.example.newsapp.R;
import com.example.newsapp.Remote.APIInterface;
import com.example.newsapp.Remote.RetrofitClient;
import com.example.newsapp.action.DialogType;
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

public class MainActivity extends AppCompatActivity implements Info {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setTitle("News");

        startActivity(new Intent(this, BottomNavActivity.class));


    }

}