package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Asterium on 18.04.2017.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "New Boot app is here";
    }
}
