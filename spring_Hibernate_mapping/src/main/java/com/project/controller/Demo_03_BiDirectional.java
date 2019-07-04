package com.project.controller;

import com.project.service.InstructorDetailService;

import java.util.Scanner;

public class Demo_03_BiDirectional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id to search");
        int id = scanner.nextInt();
        InstructorDetailService instructorDetailService = new InstructorDetailService();
        System.out.println(
            instructorDetailService
                .getById(id)
                    .getInstructor()
                        .toString()
        );
    }
}
