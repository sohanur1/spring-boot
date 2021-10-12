package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/user/{id}")
    public String deleteUsertById(@PathVariable("id") Long userId){
        userService.deleteUserById(userId);
        return "User deleted successfully";

    }
    @PutMapping("/user/{id}")
    public User updateUserId(@PathVariable ("id") Long userId,
                                         @RequestBody User user){
        return userService.updateUserId(userId,user);

    }

}
