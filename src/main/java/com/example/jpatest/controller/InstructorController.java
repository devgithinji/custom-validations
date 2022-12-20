package com.example.jpatest.controller;

import com.example.jpatest.model.Instructor;
import com.example.jpatest.model.InstructorDetail;
import com.example.jpatest.repository.InstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private InstructorRepo instructorRepo;



    @GetMapping
    public List<Instructor> getInstructors(){
        return instructorRepo.findAll();
    }

    @PostMapping
    public Instructor createInstructor() {
        Instructor instructor = new Instructor("dennis", "githinji", "dennis@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("https://www.densoftdev.com", "densoft dev");
        instructor.setInstructorDetail(instructorDetail);
        return instructorRepo.save(instructor);
    }

    @DeleteMapping
    public String deleteInstructor() {
        instructorRepo.deleteById(4);
        return "instructor deleted";
    }
}
