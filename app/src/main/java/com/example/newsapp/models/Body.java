
package com.example.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("containsAudio")
    @Expose
    private Boolean containsAudio;
    @SerializedName("containsVideo")
    @Expose
    private Boolean containsVideo;
    @SerializedName("containsPhotogallery")
    @Expose
    private Boolean containsPhotogallery;

    public Boolean getContainsAudio() {
        return containsAudio;
    }

    public void setContainsAudio(Boolean containsAudio) {
        this.containsAudio = containsAudio;
    }

    public Boolean getContainsVideo() {
        return containsVideo;
    }

    public void setContainsVideo(Boolean containsVideo) {
        this.containsVideo = containsVideo;
    }

    public Boolean getContainsPhotogallery() {
        return containsPhotogallery;
    }

    public void setContainsPhotogallery(Boolean containsPhotogallery) {
        this.containsPhotogallery = containsPhotogallery;
    }

}
