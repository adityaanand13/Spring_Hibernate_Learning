package com.project.controller;

import com.project.entity.InstructorDetail;
import com.project.service.InstructorDetailService;

public class Demo_04_Delete_BiDirc {
    public static void main(String[] args) {
        InstructorDetailService instructorDetailService = new InstructorDetailService();
        System.out.println(instructorDetailService.deleteById(7).getInstructor());
    }
}
