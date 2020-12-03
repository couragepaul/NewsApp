
package com.example.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("tracking")
    @Expose
    private Tracking tracking;
    @SerializedName("attribution")
    @Expose
    private Attribution attribution;
    @SerializedName("adHierarchy")
    @Expose
    private String adHierarchy;
    @SerializedName("polopolyDeptName")
    @Expose
    private String polopolyDeptName;
    @SerializedName("polopolyExternalId")
    @Expose
    private String polopolyExternalId;
    @SerializedName("orderLineupId")
    @Expose
    private String orderLineupId;
    @SerializedName("orderLineupSlug")
    @Expose
    private String orderLineupSlug;
    @SerializedName("mpxCategoryName")
    @Expose
    private String mpxCategoryName;
    @SerializedName("ottTitle")
    @Expose
    private Object ottTitle;
    @SerializedName("pageTitle")
    @Expose
    private String pageTitle;
    @SerializedName("pageDescription")
    @Expose
    private String pageDescription;

    public Tracking getTracking() {
        return tracking;
    }

    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }

    public Attribution getAttribution() {
        return attribution;
    }

    public void setAttribution(Attribution attribution) {
        this.attribution = attribution;
    }

    public String getAdHierarchy() {
        return adHierarchy;
    }

    public void setAdHierarchy(String adHierarchy) {
        this.adHierarchy = adHierarchy;
    }

    public String getPolopolyDeptName() {
        return polopolyDeptName;
    }

    public void setPolopolyDeptName(String polopolyDeptName) {
        this.polopolyDeptName = polopolyDeptName;
    }

    public String getPolopolyExternalId() {
        return polopolyExternalId;
    }

    public void setPolopolyExternalId(String polopolyExternalId) {
        this.polopolyExternalId = polopolyExternalId;
    }

    public String getOrderLineupId() {
        return orderLineupId;
    }

    public void setOrderLineupId(String orderLineupId) {
        this.orderLineupId = orderLineupId;
    }

    public String getOrderLineupSlug() {
        return orderLineupSlug;
    }

    public void setOrderLineupSlug(String orderLineupSlug) {
        this.orderLineupSlug = orderLineupSlug;
    }

    public String getMpxCategoryName() {
        return mpxCategoryName;
    }

    public void setMpxCategoryName(String mpxCategoryName) {
        this.mpxCategoryName = mpxCategoryName;
    }

    public Object getOttTitle() {
        return ottTitle;
    }

    public void setOttTitle(Object ottTitle) {
        this.ottTitle = ottTitle;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
    }

}
