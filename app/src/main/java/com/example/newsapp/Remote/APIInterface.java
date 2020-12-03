package com.example.newsapp.Remote;


import com.example.newsapp.models.ListItemModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface APIInterface {
    @GET("items?lineupSlug=news")
    Call<List<ListItemModel>> getData(
            @Query("page") int page,
            @Query("limit") int limit
    );
}
