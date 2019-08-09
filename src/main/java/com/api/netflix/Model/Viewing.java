package com.api.netflix.Model;

public class Viewing extends Clients {
    private int viewingID;
    private int mediaID;

    public Viewing() {
    }

    @Override
    public int getViewingID() {
        return viewingID;
    }

    @Override
    public void setViewingID(int viewingID) {
        this.viewingID = viewingID;
    }

    public int getMediaID() {
        return mediaID;
    }

    public void setMediaID(int mediaID) {
        this.mediaID = mediaID;
    }
}
