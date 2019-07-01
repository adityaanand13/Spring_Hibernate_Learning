package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Home";
    }

    @RequestMapping("/show-form")
    public String showForm(){
        return "ShowForm";
    }

    @RequestMapping("/process-form")
    public String processForm(){
        return "DisplayName";
    }

    @RequestMapping("/show-form2")
    public String showForm2(){
        return "ShowForm2";
    }

    // Read http request parameter
    // use and manipulate model
    @RequestMapping("process-form2")
    public String processForm2(@RequestParam("StudentName") String name, Model model ){
        name = name.toUpperCase();
        model.addAttribute("message", name);

        return "DisplayName2";
    }

    // old version
    /*
    public String processForm2(HttpServletRequest request, Model model ){
        String name = "in upper case "+ request.getParameter("StudentName").toUpperCase();
        model.addAttribute("message", name);

        return "DisplayName2";
    }
*/
}
