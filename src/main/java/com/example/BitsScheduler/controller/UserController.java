package com.example.BitsScheduler.controller;

import com.example.BitsScheduler.entity.User;
import com.example.BitsScheduler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public User registerUser(@RequestBody User user) {
        // Perform some health checks here
        return userService.registerUser(user);
    }
}

