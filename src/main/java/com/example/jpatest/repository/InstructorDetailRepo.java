package com.example.jpatest.repository;

import com.example.jpatest.model.InstructorDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorDetailRepo extends JpaRepository<InstructorDetail, Integer> {
}
