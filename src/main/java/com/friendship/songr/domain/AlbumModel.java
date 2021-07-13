package com.friendship.songr.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "albums")
@JsonIgnoreProperties(value = { "songs" })
public class AlbumModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String artist;
    private int song_count;
    private String length;
    private String image_url;

    @OneToMany(mappedBy = "album")
    private List<SongModel> songs;
    public AlbumModel(){
        super();
    }
    public AlbumModel(String title, String artist, int song_count, String length , String image_url) {
        this.title = title;
        this.artist = artist;
        this.song_count = song_count;
        LocalDateTime now = LocalDateTime.now();
        this.length = length;
        this.image_url = image_url;
    }


    public AlbumModel(AlbumModel[] albumModels) {

    }

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

    public AlbumModel setArtist(String artist) {
        this.artist = artist;
        return null;
    }

    public int getSong_count() {
        return song_count;
    }

    public void setSong_count(int song_count) {
        this.song_count = song_count;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
    public List<SongModel> getSongs() {
        return songs;
    }
}
