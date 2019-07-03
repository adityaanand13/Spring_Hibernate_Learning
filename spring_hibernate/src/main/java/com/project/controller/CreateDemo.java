package com.project.controller;

import com.project.entity.Student;
import com.project.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class CreateDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        String fname = scanner.next();
        System.out.println("enter last name");
        String lname= scanner.next();
        System.out.println("enter email id");
        String email = scanner.next();
        StudentService studentService = new StudentService();
        studentService.createStudent(fname, lname, email);
    }
}
