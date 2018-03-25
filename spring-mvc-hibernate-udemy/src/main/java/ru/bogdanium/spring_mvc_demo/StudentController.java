package ru.bogdanium.spring_mvc_demo;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/show-form")
    public String showForm(Model model) {

        model.addAttribute("student", new Student());

        return "student-form";
    }

    @RequestMapping("/process-form")
    public String processForm(@Valid @ModelAttribute("student") Student student,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "student-form";
        } else {
            return "student-confirmation";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
}
