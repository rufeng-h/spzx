package com.windcf.sprintbootdemo.service;

import com.windcf.sprintbootdemo.model.entity.SysUser;
import com.windcf.sprintbootdemo.model.form.LoginForm;
import com.windcf.sprintbootdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public SysUser login(LoginForm form) {
        return userRepository.findByUsernameAndPassword(form.getUsername(), form.getPassword());
    }
}
