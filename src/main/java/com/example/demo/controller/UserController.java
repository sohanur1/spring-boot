package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveDepartment(user);
    }
    @GetMapping("/user")
    public List<User> fetchUserList(){

        return userService.fetchUserList();
    }

}
