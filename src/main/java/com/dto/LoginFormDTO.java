package com.dto;

import lombok.Data;

/*
    @ 登录信息DTO
    @ 电话 - 验证码 - 密码
 */
@Data
public class LoginFormDTO {
    private String phone;
    private String code;
    private String password;
}
