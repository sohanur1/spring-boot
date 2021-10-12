package com.example.demo.service;


import com.example.demo.entity.User;

import java.util.List;

public interface UserService {


    User saveDepartment(User user);

    List<User> fetchUserList();
}
