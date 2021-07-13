package com.friendship.songr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




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


//@ResponseBody
//    @PostMapping

}
