package com.example.jpatest.controller;

import com.example.jpatest.DTO.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public UserDTO createUser(@Valid @RequestBody UserDTO userDTO) {
        System.out.println("a good one");
        return userDTO;
    }
}
