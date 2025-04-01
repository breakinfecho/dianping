package com.service.impl;

import com.entity.UserInfo;
import com.mapper.UserInfoMapper;
import com.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/*
 * @ author 柠
 * @ 业务逻辑实现类
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
