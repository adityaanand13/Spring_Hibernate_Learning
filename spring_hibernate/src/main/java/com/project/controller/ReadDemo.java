package com.project.controller;

import com.project.entity.Student;
import com.project.service.StudentService;

import java.util.List;

public class ReadDemo {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        List<Student> students = studentService.getStudents();
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
