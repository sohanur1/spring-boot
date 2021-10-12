package com.example.demo.service;


import com.example.demo.entity.Country;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveDepartment(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long userId) {
      userRepository.deleteById(userId);
    }

    @Override
    public User updateUserId(Long userId,User user) {
        User usDB = userRepository.findById(userId).get();

        if (Objects.nonNull(user.getUserName()) &
                !"".equalsIgnoreCase(user.getUserName())) {
            usDB.setUserName(user.getUserName());
        }
        if (Objects.nonNull(user.getUserMail()) &
                !"".equalsIgnoreCase(user.getUserMail())) {
            usDB.setUserMail(user.getUserMail());
        }
        if (Objects.nonNull(user.getUserBirthdate()) &
                !"".equalsIgnoreCase(user.getUserBirthdate())) {
            usDB.setUserBirthdate(user.getUserBirthdate());
        }
        return userRepository.save(usDB);
    }
}
