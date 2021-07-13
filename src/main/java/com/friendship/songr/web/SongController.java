package com.friendship.songr.web;

import com.friendship.songr.domain.AlbumModel;
import com.friendship.songr.domain.SongModel;
import com.friendship.songr.infrastructure.AlbumRepository;
import com.friendship.songr.infrastructure.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @PostMapping("/songs")
    public ResponseEntity<SongModel> createSong(@RequestParam Long trackNumber,@RequestParam String title, @RequestParam String song_length){
        SongModel songModel = new SongModel(trackNumber,title,song_length);
        SongModel savedSong = songRepository.save(songModel);
        return new ResponseEntity<>(savedSong, HttpStatus.CREATED);
    }


    @PostMapping("/songs/{id}/albums")
    public ResponseEntity<SongModel> addSongAlbum(@PathVariable Long id, Long trackNumber) {
        AlbumModel album = albumRepository.findById(trackNumber).orElseThrow();
        SongModel song = songRepository.findById(id).orElseThrow();
        song.setAlbum(album);
        return new ResponseEntity<>(songRepository.save(song), HttpStatus.OK);
    }
    @GetMapping("/songs/{trackNumber}")
    public ResponseEntity<SongModel> getOneSong(@PathVariable Long trackNumber) {
        SongModel returnedSong = songRepository.findById(trackNumber).orElseThrow();
        return new ResponseEntity<>(returnedSong, HttpStatus.OK);
    }

}
