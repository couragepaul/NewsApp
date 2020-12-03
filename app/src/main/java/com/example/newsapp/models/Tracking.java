
package com.example.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tracking {

    @SerializedName("subsection1")
    @Expose
    private String subsection1;
    @SerializedName("subsection2")
    @Expose
    private String subsection2;
    @SerializedName("subsection3")
    @Expose
    private String subsection3;
    @SerializedName("subsection4")
    @Expose
    private String subsection4;
    @SerializedName("contentarea")
    @Expose
    private String contentarea;
    @SerializedName("contenttype")
    @Expose
    private String contenttype;

    public String getSubsection1() {
        return subsection1;
    }

    public void setSubsection1(String subsection1) {
        this.subsection1 = subsection1;
    }

    public String getSubsection2() {
        return subsection2;
    }

    public void setSubsection2(String subsection2) {
        this.subsection2 = subsection2;
    }

    public String getSubsection3() {
        return subsection3;
    }

    public void setSubsection3(String subsection3) {
        this.subsection3 = subsection3;
    }

    public String getSubsection4() {
        return subsection4;
    }

    public void setSubsection4(String subsection4) {
        this.subsection4 = subsection4;
    }

    public String getContentarea() {
        return contentarea;
    }

    public void setContentarea(String contentarea) {
        this.contentarea = contentarea;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

}
