package com.friendship.songr.domain;

import javax.persistence.*;

@Entity
@Table(name = "songs")

public class SongModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long trackNumber;
    private String title;
    private String song_length;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="album")
    private AlbumModel album;
    public SongModel(){
        super();

    }
    public SongModel(Long trackNumber,String title, String song_length) {
        this.trackNumber=trackNumber;
        this.title = title;
        this.song_length = song_length;
    }
    public SongModel(Long trackNumber){
        this.trackNumber = trackNumber;
    }

    public Long getTrackNumber() {
        return trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSong_length() {
        return song_length;
    }

    public void setSong_length(String song_length) {
        this.song_length = song_length;
    }

    public AlbumModel getAlbum() {
        return album;
    }

    public void setAlbum(AlbumModel album) {
        this.album = album;
    }

}
