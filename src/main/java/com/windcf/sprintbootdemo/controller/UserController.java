package com.windcf.sprintbootdemo.controller;

import com.windcf.sprintbootdemo.common.ApiResponse;
import com.windcf.sprintbootdemo.model.entity.SysUser;
import com.windcf.sprintbootdemo.model.form.LoginForm;
import com.windcf.sprintbootdemo.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Validated
    @PostMapping("/login")
    public ApiResponse<SysUser> login(@Valid @RequestBody LoginForm form) {
        return ApiResponse.success(userService.login(form));
    }
}
