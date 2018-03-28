package ru.bogdanium.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject() {
        System.out.println("=====Get request");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject() {
        System.out.println("=====Post request");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi"})
    public String saveMultiYearProject() {
        System.out.println("=====Post request for MultiYearProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi", "special"})
    public String saveSpecialProject() {
        System.out.println("=====Post request for SpecialProject");
        return "project_add";
    }
}
