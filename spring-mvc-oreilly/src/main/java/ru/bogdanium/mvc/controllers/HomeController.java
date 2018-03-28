package ru.bogdanium.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bogdanium.mvc.data.entities.Project;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String goHome(Model model) {

        Project project = new Project();
        project.setName("First");
        project.setSponsor("NASA");
        project.setDescription("Simple");

        model.addAttribute("currentProject", project);

        return "home";
    }
}
