package com.service;

import com.dto.Result;
import com.entity.Follow;
import com.baomidou.mybatisplus.extension.service.IService;

/*
 * @ author 柠
 * @ 业务逻辑层接口
 */
public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);
}
