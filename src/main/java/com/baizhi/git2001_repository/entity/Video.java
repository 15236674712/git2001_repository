package com.baizhi.git2001_repository.entity;

public class Video {
    private String title;
    private String cover;
    private String description;

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Video() {
    }

    public Video(String title, String cover, String description) {
        this.title = title;
        this.cover = cover;
        this.description = description;
    }
}
