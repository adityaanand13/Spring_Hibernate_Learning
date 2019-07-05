package com.project.controller;

import com.project.service.CourseService;
import com.project.service.StudentService;

public class Demo_08_ManyToMany {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        courseService.addStudent(10,
            studentService.create(
                "Aditya",
                "Anand",
                "aditya13@live.com"
            )
        );
        courseService.addStudent(10,
            studentService.create(
                "Jhuni",
                "yadav",
                "jy@gmail.com"
            )
        );
        System.out.println(courseService.getById(10));
    }
}
