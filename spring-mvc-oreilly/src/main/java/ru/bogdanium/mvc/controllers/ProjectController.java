package ru.bogdanium.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.bogdanium.mvc.data.entities.Project;
import ru.bogdanium.mvc.data.services.ProjectService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/{projectId}")
    public String findProject(Model model, @PathVariable Long projectId) {

        model.addAttribute("project", this.projectService.find(projectId));

        return "project";
    }

    @RequestMapping(value = "/find")
    public String find(Model model) {
        model.addAttribute("projects", this.projectService.findAll());
        return "projects";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject(HttpSession session) {
        session.setAttribute("token", "12345");
        System.out.println("=====Get request");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute Project project) {

        System.out.println("=====Post request");
        System.out.println(project);
        return "project_add";
    }

}
