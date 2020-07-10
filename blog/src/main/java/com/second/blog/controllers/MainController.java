package com.second.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String login( Model model) {
        model.addAttribute("title", "Авторизація");
        return "login";
    }

    @GetMapping("/about")
    public String about( Model model) {
        model.addAttribute("title", "Про нас");
        return "about";
    }


    @GetMapping("/registration")
    public String registration(Model model ) {
        return "registration";
    }



}

