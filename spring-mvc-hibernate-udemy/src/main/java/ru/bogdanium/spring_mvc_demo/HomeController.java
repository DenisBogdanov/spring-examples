package ru.bogdanium.spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {

        return "main-menu";
    }
}
