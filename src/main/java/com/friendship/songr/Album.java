package com.friendship.songr;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Calendar;
@Entity
@Table(name = "java_greetings")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;
    private int songCount;
    private String length;
    private String imageUrl;


    public Album(String title, String artist, int songCount, String length , String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        LocalDateTime now = LocalDateTime.now();
        this.length = length;
        this.imageUrl = imageUrl;
    }
public Album(){}

    public Long getId() {
        return id;
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

    public Album setArtist(String artist) {
        this.artist = artist;
        return null;
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
