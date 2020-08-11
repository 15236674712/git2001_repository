package com.baizhi.git2001_repository.entity;

public class Category {

    private String id;
    private String cateName;

    public Category(String id, String cateName) {
        this.id = id;
        this.cateName = cateName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", cateName='" + cateName + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Category() {
    }
}
