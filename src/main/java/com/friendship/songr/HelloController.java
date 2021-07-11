package com.friendship.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HelloController {
    @GetMapping("/hello")
    String hello(){
        return "helloPage";
    }
    @GetMapping("/capitalize/hello")
    String capitalize(@RequestParam(name="name",required = false,defaultValue = "THIS IS KINDA CAPITALIZED" ) String name , Model model){
        System.out.println("name is "+name);
        model.addAttribute("name",name);
        return "capitalize";
    }
@ResponseBody
    @GetMapping("/album")
ArrayList album(){
    ArrayList albums = new ArrayList();
    Album album1 = new Album("Moonlight","maichle",7,"5:30","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
    Album album2 = new Album("Spring","jones",15,"6:02","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.mJ4hrNKMi7lHaXdcbkVwiAHaHa%26pid%3DApi&f=1");
    Album album3 = new Album("Sun Raise","john",10,"4:15","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.BIlkqO504KYHLj__I7ufQgHaHa%26pid%3DApi&f=1");
    albums.add(album1);
    albums.add(album2);
    albums.add(album3);

    return albums;
}

}
