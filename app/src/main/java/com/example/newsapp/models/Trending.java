
package com.example.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trending {

    @SerializedName("numViewers")
    @Expose
    private Object numViewers;
    @SerializedName("numViewersSRS")
    @Expose
    private Object numViewersSRS;

    public Object getNumViewers() {
        return numViewers;
    }

    public void setNumViewers(Object numViewers) {
        this.numViewers = numViewers;
    }

    public Object getNumViewersSRS() {
        return numViewersSRS;
    }

    public void setNumViewersSRS(Object numViewersSRS) {
        this.numViewersSRS = numViewersSRS;
    }

}
