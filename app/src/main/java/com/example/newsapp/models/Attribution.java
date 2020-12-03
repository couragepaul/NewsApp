
package com.example.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attribution {

    @SerializedName("level1")
    @Expose
    private String level1;
    @SerializedName("level2")
    @Expose
    private String level2;
    @SerializedName("level3")
    @Expose
    private String level3;

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

}
