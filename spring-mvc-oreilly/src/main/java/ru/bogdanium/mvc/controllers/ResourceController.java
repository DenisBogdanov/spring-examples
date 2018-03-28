package ru.bogdanium.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bogdanium.mvc.data.entities.Resource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping("/add")
    public String add(Model model) {
        List<String> options = new LinkedList<>(Arrays.asList("Material", "Other", "Staff", "Technical Equipment"));

        List<String> radios = new LinkedList<>(Arrays.asList("Hours", "Piece", "Tons"));
        model.addAttribute("radioOptions", radios);

        List<String> checks = new LinkedList<>(Arrays.asList("Lead Time", "Special Rate", "Requires Approval"));
        model.addAttribute("checkOptions", checks);

        model.addAttribute("typeOptions", options);
        model.addAttribute("resource", new Resource());
        return "resource_add";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute Resource resource) {
        System.out.println(resource);
        System.out.println("Invoking the save() method.");
        return "redirect:/resource/add";
    }
}