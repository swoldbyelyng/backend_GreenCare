package com.banzaii.GreenCare.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/test")
    public String getTestMessage(){
        return "This is a test";
    }

}
