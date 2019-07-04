package com.project.controller;

import com.project.service.InstructorService;

public class Demo_01_Create {
    public static void main(String[] args) {
        InstructorService instructorService = new InstructorService();
        System.out.println(
            instructorService.create
            (
                "Aditya",
                "Anand",
                "AA13@gmail.com",
                "youtube.com/a13",
                "Photography"
            )
        );System.out.println(
            instructorService.create
            (
                "Anurag",
                "Anand",
                "anu21j@gmail.com",
                "youtube.com/anu21",
                "Coding"
            )
        );System.out.println(
            instructorService.create
            (
                "Shubham",
                "Bibiyan",
                "SBI@gmail.com",
                "youtube.com/SBI",
                "Video Games"
            )
        );
    }
}
