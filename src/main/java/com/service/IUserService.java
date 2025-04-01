package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dto.LoginFormDTO;
import com.dto.Result;
import com.entity.User;

import javax.servlet.http.HttpSession;

/*
 * @ author 柠
 * @ 业务逻辑层接口
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
