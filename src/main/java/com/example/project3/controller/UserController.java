package com.example.project3.controller;

import com.example.project3.login.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request) {
        userService.registerUser(request.getUsername(), request.getPassword(), "ROLE_USER");
        return "User registered successfully!";
    }
}
