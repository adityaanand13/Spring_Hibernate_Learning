package com.project.controller;

import com.project.entity.Course;
import com.project.service.InstructorService;

import java.util.Arrays;
import java.util.List;

public class Demo_06_EasyLazy {
    public static void main(String[] args) {
        InstructorService instructorService = new InstructorService();
        // the following method will not work as we are trying to access the courses after the session has been closed
        // either use Eager in mapping annotation or fetch using HQL

//        List<Course> courses = instructorService.getById(1).getCourses();
//        System.out.println(Arrays.toString(courses.toArray()));

        //getting courses using HQL(implemented in instruction service)
        List<Course> courses = instructorService.getWithCourses(1).getCourses();
        System.out.println(Arrays.toString(courses.toArray()));
    }
}
