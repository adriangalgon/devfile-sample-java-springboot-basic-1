package com.example.demo.controller;

import org.springframework.stereotype.Controller;
/**
 * Adrián Galindo González
 */
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping({"/index","/home","/",""})
    public String index(){
        return "Home";
    }
}
