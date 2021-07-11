package com.friendship.songr;

import java.io.File;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Album {
    private String title;
    private String artist;
    private int songCount;
    private String length;
    private String imageUrl;
    Calendar calendar = Calendar.getInstance();

    public Album(String title, String artist, int songCount, String length , String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        LocalDateTime now = LocalDateTime.now();
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
