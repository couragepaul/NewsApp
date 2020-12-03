package com.example.newsapp.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.R;
import com.facebook.drawee.view.SimpleDraweeView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    //TODO: initialize Views

    SimpleDraweeView image;
    TextView author;
    TextView description;
    TextView headline;
    TextView publishedDate;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        // TODO: Cast Views

        image = itemView.findViewById(R.id.profile_image);
        author = itemView.findViewById(R.id.author);
        description = itemView.findViewById(R.id.description);
        headline = itemView.findViewById(R.id.headline);
        publishedDate = itemView.findViewById(R.id.published_date);

    }



}


