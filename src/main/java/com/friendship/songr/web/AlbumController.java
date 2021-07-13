package com.friendship.songr.web;

import com.friendship.songr.domain.AlbumModel;
import com.friendship.songr.infrastructure.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
@Autowired
    private AlbumRepository albumRepo;
public AlbumModel[] albumModels;
    @GetMapping("/album-basic")
    public String album(Model model){
        AlbumModel albumModel1 = new AlbumModel("Moonlight","maichle",7,"5:30","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
        AlbumModel albumModel2 = new AlbumModel("Spring","jones",15,"6:02","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.mJ4hrNKMi7lHaXdcbkVwiAHaHa%26pid%3DApi&f=1");
        AlbumModel albumModel3 = new AlbumModel("Sun Raise","john",10,"4:15","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.BIlkqO504KYHLj__I7ufQgHaHa%26pid%3DApi&f=1");
        albumModels = new AlbumModel[]{albumModel1, albumModel2, albumModel3};
        model.addAttribute("albums", albumModels);
        albumRepo.findAll();
        return "albums";
    }
//    @ResponseBody
    @PostMapping("/album")
    public RedirectView albumSubmit(@RequestParam String title, @RequestParam String artist,
                                    @RequestParam String image_url, @RequestParam String length , @RequestParam int song_count,Model model){
       AlbumModel albumModel = new AlbumModel(title,artist,song_count,length,image_url);
        AlbumModel albums = albumRepo.save(albumModel);
        model.addAttribute("album",albums);
        return new RedirectView("/album-basic");
    }

    @PostMapping("/albums")
    public ResponseEntity<AlbumModel> createAlbum(String title, String artist, String length, int song_count , String img_url) {
        AlbumModel savedAlbum = albumRepo.save(new AlbumModel(albumModels));
        return new ResponseEntity<>(savedAlbum, HttpStatus.CREATED);
    }

//    @GetMapping("/departments/{id}")
//    public ResponseEntity<Department> getOneStudent(@PathVariable Long id) {
//        Department returnedDepartment = departmentRepository.findById(id).orElseThrow();
//        return new ResponseEntity<>(returnedDepartment, HttpStatus.OK);
//    }

}
