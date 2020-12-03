
package com.example.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("square_140")
    @Expose
    private String square140;

    public String getSquare140() {
        return square140;
    }

    public void setSquare140(String square140) {
        this.square140 = square140;
    }

}
