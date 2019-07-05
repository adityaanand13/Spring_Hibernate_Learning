package com.project.controller;

import com.project.service.CourseService;

public class Demo_07_OneToMany_BiDirec {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        courseService.printById(11);
        courseService.addReview(11,"Nice strategy");
        courseService.addReview(11,"Need more work");
        courseService.addReview(11,"Instructor could had been better");
        courseService.printById(11);
    }
}
