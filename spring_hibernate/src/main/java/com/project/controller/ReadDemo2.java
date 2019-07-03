package com.project.controller;

import com.project.service.StudentService;

import java.util.Scanner;

public class ReadDemo2 {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id to search");
        int id = scanner.nextInt();
        System.out.println(studentService.getById(id).toString());
    }


}
