package com.example.newsapp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.DownloadListener;
import com.example.newsapp.Info.Info;
import com.example.newsapp.R;
import com.example.newsapp.db.table.ListItemTable;
import com.example.newsapp.models.ListItemModel;
import com.example.newsapp.models.News;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> implements Info {
    Context context;

    ArrayList<ListItemModel> listItemModels;
    ArrayList<News> newsArrayList;
    boolean isNews = false;

    public RecyclerViewAdapter(Context context, ArrayList<ListItemModel> listItemModels) {
        this.context = context;
        this.listItemModels = listItemModels;
    }
    public RecyclerViewAdapter(Context context, ArrayList<News> listItemModels, boolean isNews) {
        this.context = context;
        this.newsArrayList = listItemModels;
        this.isNews = isNews;
    }



    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG, "onCreateViewHolder: ");
        LayoutInflater li = LayoutInflater.from(context);
        View view = li.inflate(R.layout.my_layout, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        if (isNews){
            Date df = new java.util.Date(Long.parseLong(newsArrayList.get(position).getPublishedDate()));
            String vv = new SimpleDateFormat("MM dd, yyyy").format(df);
            String description = newsArrayList.get(position).getDescription();
            if (!description.equals("")) {
                holder.description.setText(description);
            } else {
                holder.description.setText(R.string.no_description);
            }
            holder.publishedDate.setText(vv);
            holder.headline.setText(newsArrayList.get(position).getHeadline());
            String author = newsArrayList.get(position).getType();
            if (!author.equals("")) {
                holder.author.setText(author);
            } else {
                holder.author.setText(R.string.no_author);
            }

            displayImageFromPath(newsArrayList.get(position).getImage(), holder.image);

            return;
        }


        Log.i(TAG, "onBindViewHolder: " + listItemModels.get(position).getTitle());


        if (!listItemModels.get(position).getImages().getSquare140().equals(null)) {
            Log.i(TAG, "onBindViewHolder: " + listItemModels.get(position).getImages().getSquare140());
            holder.image.setImageURI(listItemModels.get(position).getImages().getSquare140());
        }
        Date df = new java.util.Date(listItemModels.get(position).getPublishedAt());
        String vv = new SimpleDateFormat("MM dd, yyyy").format(df);
        String description = listItemModels.get(position).getDescription();
        if (!description.equals("")) {
            holder.description.setText(description);
        } else {
            holder.description.setText(R.string.no_description);
        }
        holder.publishedDate.setText(vv);
        holder.headline.setText(listItemModels.get(position).getTitle());
        String author = listItemModels.get(position).getTypeAttributes().getAuthor().getName();
        if (!author.equals("")) {
            holder.author.setText(author);
        } else {
            holder.author.setText(R.string.no_author);
        }



        ListItemTable listItemTable = new ListItemTable(context);
        listItemTable.insertListItem(listItemModels.get(position),
                downloadImageGetPath(listItemModels.get(position).getImages().getSquare140()));
    }

    @Override
    public int getItemCount() {

        if (isNews){
            return newsArrayList.size();
        }

        Log.i(TAG, "getItemCount: " + listItemModels.size());
        return listItemModels.size();
    }


    private String downloadImageGetPath(String url) {
        Log.i("/////////", "downloadImage: ");
        AndroidNetworking.initialize(context);
        String dirPath = Environment.getExternalStorageDirectory() + "";
        String fileName = System.currentTimeMillis() + "image.jpeg";
        File file = new File(dirPath, fileName);
        try {
            file.createNewFile();
            Log.i("/////", "onCreate: File created");
        } catch (IOException e) {
            e.printStackTrace();
        }

        AndroidNetworking.download(url, dirPath, fileName)
                .build()
                .startDownload(new DownloadListener() {
                    @Override
                    public void onDownloadComplete() {

                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.i("/////", "onError: " + anError);
                    }

                });

        return dirPath + "/" + fileName;
    }

    private void displayImageFromPath(String path, ImageView imageView) {
        File imgFile = new File(path);
        if (imgFile.exists()) {
            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
            imageView.setImageBitmap(myBitmap);
        } else {
            Log.i("///////", "displayImageFromPath: File Does Not Exists ");
        }

    }



}
