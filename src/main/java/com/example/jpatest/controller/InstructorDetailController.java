package com.example.jpatest.controller;

import com.example.jpatest.model.InstructorDetail;
import com.example.jpatest.repository.InstructorDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructor-detail")
public class InstructorDetailController {

    @Autowired
    private InstructorDetailRepo instructorDetailRepo;

    @GetMapping
    public List<InstructorDetail> getInstructorDetails() {
        return instructorDetailRepo.findAll();
    }
}
