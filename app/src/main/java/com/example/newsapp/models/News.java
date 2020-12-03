package com.example.newsapp.models;

public class News {
    String image;
    String author;
    String description;
    String headline;
    String publishedDate;
    String type;


    public News(String image, String author, String description, String headline, String publishedDate, String type) {
        this.image = image;
        this.author = author;
        this.description = description;
        this.headline = headline;
        this.publishedDate = publishedDate;
        this.type = type;
    }


    public String getImage() {
        return image;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getHeadline() {
        return headline;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getType() {
        return type;
    }
}
