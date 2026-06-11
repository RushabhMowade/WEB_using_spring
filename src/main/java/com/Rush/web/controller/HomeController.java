package com.Rush.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    //@ResponseBody
    public String greet(){
        return "Yeahh its working";
    }

    @RequestMapping("/about")
    public String about(){
        return "Backend Developer hi kehde";
    }
}
