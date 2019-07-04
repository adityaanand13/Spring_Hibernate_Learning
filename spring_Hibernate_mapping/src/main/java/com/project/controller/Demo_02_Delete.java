package com.project.controller;

import com.project.service.InstructorService;

public class Demo_02_Delete {
    // delete an entry
    public static void main(String[] args) {
        InstructorService instructorService = new InstructorService();
        System.out.println(instructorService.deleteById(3));
        System.out.println(instructorService.deleteById(5));
        System.out.println(instructorService.deleteById(1));
        System.out.println(instructorService.deleteById(2));
        System.out.println(instructorService.deleteById(4));
        System.out.println(instructorService.deleteById(6));
        System.out.println(instructorService.deleteById(7));
    }

}
