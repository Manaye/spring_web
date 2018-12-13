package com.firstwebapp.practice.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {
   @ResponseBody
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String helloWorld(Model m){
        return "Hello world!";
    }
    @ResponseBody
    @RequestMapping(value = "/capitalize/{string}",method = RequestMethod.GET)
    public String capitalizeString(@PathVariable() String string, Model m) {
        return capitalizeString(string);
    }
    public static String capitalizeString(String string){
        return string.toUpperCase();
    }

}





