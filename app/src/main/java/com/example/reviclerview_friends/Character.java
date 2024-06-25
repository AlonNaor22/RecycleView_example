package com.example.reviclerview_friends;

// Character.java
public class Character {
    private String name;
    private String description;
    private int imageResId; // Image resource ID for each character

    public Character(String name, String description, int imageResId) {
        this.name = name;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }
}
