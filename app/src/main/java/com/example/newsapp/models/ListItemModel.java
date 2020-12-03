package com.example.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListItemModel {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("sourceId")
    @Expose
    private String sourceId;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("publishedAt")
    @Expose
    private Long publishedAt;
    @SerializedName("readablePublishedAt")
    @Expose
    private String readablePublishedAt;
    @SerializedName("updatedAt")
    @Expose
    private Long updatedAt;
    @SerializedName("readableUpdatedAt")
    @Expose
    private String readableUpdatedAt;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("embedTypes")
    @Expose
    private Object embedTypes;
    @SerializedName("typeAttributes")
    @Expose
    private TypeAttributes typeAttributes;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("language")
    @Expose
    private String language;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Long publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getReadablePublishedAt() {
        return readablePublishedAt;
    }

    public void setReadablePublishedAt(String readablePublishedAt) {
        this.readablePublishedAt = readablePublishedAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getReadableUpdatedAt() {
        return readableUpdatedAt;
    }

    public void setReadableUpdatedAt(String readableUpdatedAt) {
        this.readableUpdatedAt = readableUpdatedAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getEmbedTypes() {
        return embedTypes;
    }

    public void setEmbedTypes(Object embedTypes) {
        this.embedTypes = embedTypes;
    }

    public TypeAttributes getTypeAttributes() {
        return typeAttributes;
    }

    public void setTypeAttributes(TypeAttributes typeAttributes) {
        this.typeAttributes = typeAttributes;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public String toString() {
        return "ListItemModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", source='" + source + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", version='" + version + '\'' +
                ", publishedAt=" + publishedAt +
                ", readablePublishedAt='" + readablePublishedAt + '\'' +
                ", updatedAt=" + updatedAt +
                ", readableUpdatedAt='" + readableUpdatedAt + '\'' +
                ", type='" + type + '\'' +
                ", embedTypes=" + embedTypes +
                ", typeAttributes=" + typeAttributes +
                ", images=" + images +
                ", language='" + language + '\'' +
                '}';
    }
}
