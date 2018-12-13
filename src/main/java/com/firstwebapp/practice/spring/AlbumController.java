package com.firstwebapp.practice.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;

    @ResponseBody
    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public String index(Model m) {

//        Album[] albums = new Album[]{
//                new Album("something", "someone", 4, 2,"C:/users/hiwi"),
//                new Album("something2", "someone2", 4, 2,"C:/users/hiwi2")
//        };

        m.addAttribute("albums", albumRepo.findAll());
        return "albums";
    }

    //add album
    @RequestMapping(value = "/albums", method = RequestMethod.POST)
    public RedirectView create(
            @RequestParam String title,
            @RequestParam String artist,
            @RequestParam int songCount,
            @RequestParam int length,
            @RequestParam String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }
}


