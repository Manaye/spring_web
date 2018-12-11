package com.firstwebapp.practice.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("/")
    public String helloWorld(){
        return "Hello world!";
    }

    @RequestMapping("/capitalize/:word")
    public void  capitalize(RequestParam r){
        System.out.println(r.value().toUpperCase());
    }

}



