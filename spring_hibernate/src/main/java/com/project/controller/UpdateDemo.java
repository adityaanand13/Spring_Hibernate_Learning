package com.project.controller;

import com.project.service.StudentService;

import java.util.Scanner;

public class UpdateDemo {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id to update");
        int id = scanner.nextInt();
        System.out.println("Enter first name to update");
        String fname = scanner.next();
        System.out.println(studentService.updateFirstName(id,fname).toString());
    }
}
