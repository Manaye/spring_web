package com.firstwebapp.practice.spring;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlbumController {
    @ResponseBody
    @RequestMapping(value = "/albums" ,method = RequestMethod.GET)
    public  String index(Model m){

        Album[] albums = new Album[]{
                new Album("something", "someone", 4, 2,"C:/users/hiwi"),
                new Album("something2", "someone2", 4, 2,"C:/users/hiwi2")
        };
         m.addAttribute("albums", albums);
         return "albumIndex";
    }

}
