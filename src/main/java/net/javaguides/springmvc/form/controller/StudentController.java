package net.javaguides.springmvc.form.controller;

import net.javaguides.springmvc.form.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute("studentQWE", student);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("studentQWE") Student theStudent){
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLsatName());
        return "student-confirmation";
    }
}
