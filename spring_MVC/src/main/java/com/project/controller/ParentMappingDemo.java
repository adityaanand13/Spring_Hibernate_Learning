package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class ParentMappingDemo {

    @RequestMapping("/show-form")
    public String showForm(){
        return "ShowForm3";
    }

    @RequestMapping("/process-form")
    public String processForm(){
        return "DisplayName3";
    }
}
