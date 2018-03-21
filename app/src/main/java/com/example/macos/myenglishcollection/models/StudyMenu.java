package com.example.macos.myenglishcollection.models;

/**
 * Created by macos on 3/12/18.
 */

public class StudyMenu {
    private String mTitle;
    private int mImageId;
    private String mDescription;

    public StudyMenu(){

    }

    public StudyMenu(String title, int imageId, String description) {
        this.mTitle = title;
        this.mImageId = imageId;
        this.mDescription = description;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public int getImageURL() {
        return mImageId;
    }

    public void setImageURL(int imageId) {
        this.mImageId = imageId;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }
}
