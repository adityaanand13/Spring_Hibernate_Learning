package com.project.controller;

import com.project.service.StudentService;

import java.util.Scanner;

public class DeleteDemo {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id to Delete");
        int id = scanner.nextInt();
        System.out.println(studentService.deleteStudent(id).toString());
    }
}
