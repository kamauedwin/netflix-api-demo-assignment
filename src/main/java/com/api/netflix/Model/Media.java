package com.api.netflix.Model;

public class Media {
    private int mediaID;
    private String mediaName;
    private String mediaCategory;
    private String mediaType;

    public Media() {
    }

    public Media(int mediaID, String mediaName, String mediaCategory, String mediaType) {
        this.mediaID = mediaID;
        this.mediaName = mediaName;
        this.mediaCategory = mediaCategory;
        this.mediaType = mediaType;
    }

    public int getMediaID() {
        return mediaID;
    }

    public void setMediaID(int mediaID) {
        this.mediaID = mediaID;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getMediaCategory() {
        return mediaCategory;
    }

    public void setMediaCategory(String mediaCategory) {
        this.mediaCategory = mediaCategory;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return "Media{" +
                "mediaID=" + mediaID +
                ",mediaName='" +mediaName + '\'' +
                ",mediaType='" +mediaType + '\'' +
                '}';
    }
}
