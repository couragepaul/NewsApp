
package com.example.newsapp.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TypeAttributes {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("urlSlug")
    @Expose
    private String urlSlug;
    @SerializedName("deck")
    @Expose
    private String deck;
    @SerializedName("imageSmall")
    @Expose
    private String imageSmall;
    @SerializedName("imageLarge")
    @Expose
    private String imageLarge;
    @SerializedName("imageAspects")
    @Expose
    private String imageAspects;
    @SerializedName("flag")
    @Expose
    private String flag;
    @SerializedName("flags")
    @Expose
    private Flags flags;
    @SerializedName("displayComments")
    @Expose
    private Boolean displayComments;
    @SerializedName("commentsSectionId")
    @Expose
    private String commentsSectionId;
    @SerializedName("trending")
    @Expose
    private Trending trending;
    @SerializedName("mediaDuration")
    @Expose
    private Object mediaDuration;
    @SerializedName("mediaId")
    @Expose
    private Object mediaId;
    @SerializedName("mediaStreamType")
    @Expose
    private Object mediaStreamType;
    @SerializedName("mediaCaptionUrl")
    @Expose
    private Object mediaCaptionUrl;
    @SerializedName("show")
    @Expose
    private String show;
    @SerializedName("showSlug")
    @Expose
    private String showSlug;
    @SerializedName("body")
    @Expose
    private Body body;
    @SerializedName("sectionList")
    @Expose
    private List<String> sectionList = null;
    @SerializedName("sectionLabels")
    @Expose
    private List<String> sectionLabels = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("contextualHeadlines")
    @Expose
    private List<Object> contextualHeadlines = null;
    @SerializedName("headline")
    @Expose
    private Headline headline;
    @SerializedName("author")
    @Expose
    private Author author;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlSlug() {
        return urlSlug;
    }

    public void setUrlSlug(String urlSlug) {
        this.urlSlug = urlSlug;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    public String getImageLarge() {
        return imageLarge;
    }

    public void setImageLarge(String imageLarge) {
        this.imageLarge = imageLarge;
    }

    public String getImageAspects() {
        return imageAspects;
    }

    public void setImageAspects(String imageAspects) {
        this.imageAspects = imageAspects;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public Boolean getDisplayComments() {
        return displayComments;
    }

    public void setDisplayComments(Boolean displayComments) {
        this.displayComments = displayComments;
    }

    public String getCommentsSectionId() {
        return commentsSectionId;
    }

    public void setCommentsSectionId(String commentsSectionId) {
        this.commentsSectionId = commentsSectionId;
    }

    public Trending getTrending() {
        return trending;
    }

    public void setTrending(Trending trending) {
        this.trending = trending;
    }

    public Object getMediaDuration() {
        return mediaDuration;
    }

    public void setMediaDuration(Object mediaDuration) {
        this.mediaDuration = mediaDuration;
    }

    public Object getMediaId() {
        return mediaId;
    }

    public void setMediaId(Object mediaId) {
        this.mediaId = mediaId;
    }

    public Object getMediaStreamType() {
        return mediaStreamType;
    }

    public void setMediaStreamType(Object mediaStreamType) {
        this.mediaStreamType = mediaStreamType;
    }

    public Object getMediaCaptionUrl() {
        return mediaCaptionUrl;
    }

    public void setMediaCaptionUrl(Object mediaCaptionUrl) {
        this.mediaCaptionUrl = mediaCaptionUrl;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getShowSlug() {
        return showSlug;
    }

    public void setShowSlug(String showSlug) {
        this.showSlug = showSlug;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public List<String> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<String> sectionList) {
        this.sectionList = sectionList;
    }

    public List<String> getSectionLabels() {
        return sectionLabels;
    }

    public void setSectionLabels(List<String> sectionLabels) {
        this.sectionLabels = sectionLabels;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Object> getContextualHeadlines() {
        return contextualHeadlines;
    }

    public void setContextualHeadlines(List<Object> contextualHeadlines) {
        this.contextualHeadlines = contextualHeadlines;
    }

    public Headline getHeadline() {
        return headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
