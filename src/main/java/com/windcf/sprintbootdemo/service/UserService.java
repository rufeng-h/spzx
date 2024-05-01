package com.windcf.sprintbootdemo.service;

import com.windcf.sprintbootdemo.common.AppException;
import com.windcf.sprintbootdemo.model.entity.SysUser;
import com.windcf.sprintbootdemo.model.form.LoginForm;
import com.windcf.sprintbootdemo.model.vo.LoginVo;
import com.windcf.sprintbootdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RedisService redisService;

    public UserService(UserRepository userRepository, RedisService redisService) {
        this.userRepository = userRepository;
        this.redisService = redisService;
    }


    public LoginVo login(LoginForm form) {
        SysUser sysUser = userRepository.findByUsernameAndPassword(form.getUsername(), form.getPassword());
        if (sysUser == null) {
            throw new AppException("用户名或密码错误");
        }
        String token = UUID.randomUUID().toString().replaceAll("-", "");

        redisService.setEx(token, sysUser, 3600);
        LoginVo loginVo = new LoginVo();
        loginVo.setToken(token);
        return loginVo;
    }
}
