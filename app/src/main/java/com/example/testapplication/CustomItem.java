package com.example.testapplication;

// CustomItem.java
public class CustomItem {
    private String name;
    private String description;
    private  String date;
    private int imageResourceId;

    public CustomItem(String name, String description,String date,int imageResourceId) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
