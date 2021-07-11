package com.friendship.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@Controller
public class AlbumController {
@Autowired
    private AlbumRepository albumRepo;
    @GetMapping("/album-basic")
    public String album(Model model){
        Album album1 = new Album("Moonlight","maichle",7,"5:30","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
        Album album2 = new Album("Spring","jones",15,"6:02","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.mJ4hrNKMi7lHaXdcbkVwiAHaHa%26pid%3DApi&f=1");
        Album album3 = new Album("Sun Raise","john",10,"4:15","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.BIlkqO504KYHLj__I7ufQgHaHa%26pid%3DApi&f=1");
        Album[] albums ={album1,album2,album3};
        model.addAttribute("albums",albums);

        return "albums";
    }

    @GetMapping("/album")
    public String albumForm(Model model){
        List<Album> albums = albumRepo.findAll();
        model.addAttribute("album", albums);
//        model.addAttribute("album",new Album());
        return "albums";
    }

    @PostMapping("/album")
    public RedirectView albumSubmit(@ModelAttribute Album album,Model model){
        Album albums = albumRepo.save(album);
        System.out.println("kkkkkkkk"+albums.getTitle());
        model.addAttribute("album",albums);
        return new RedirectView("/album");
    }


}
