package com.spring.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//обработка всех переходов на сайте
@Controller
public class MainController {

    //какой адресс обрабатываем
    @GetMapping("/") //главная страница через "/"
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    /*
    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("title", "Блог");
        return "blog";
    }

     */

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О нас");
        return "about";
    }

}