package com.project.controller;

import com.project.service.CourseService;
import com.project.service.InstructorService;

public class Demo_05_OneToMany {
    public static void main(String[] args) {
        InstructorService instructorService = new InstructorService();
//        instructorService.addCourse(1, "BCA-301");
//        instructorService.addCourse(1, "BCA-302");
//        instructorService.addCourse(1, "BCA-303");
//        instructorService.addCourse(1, "BCA-304");
        instructorService.printById(1);
//        CourseService courseService = new CourseService();
//        courseService.deleteById(12);
    }
}
