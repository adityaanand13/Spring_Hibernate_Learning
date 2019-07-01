package com.project.controller;

import com.project.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/ShowForm")
    public String ShowForm(Model model){
        //create a student object
        Student student = new Student();

        //add the student object as a model
        model.addAttribute("student", student);
        return "StudentShowForm";
    }

    @RequestMapping("/process-form")
    public String processForm(@ModelAttribute("student") Student student){

        return "StudentConfirmation";
    }
}
