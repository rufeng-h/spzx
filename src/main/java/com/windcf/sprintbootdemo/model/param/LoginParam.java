package com.windcf.sprintbootdemo.model.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginParam {
    @NotBlank
    String username;
    @NotBlank
    String password;
}
