package com.service;

import com.dto.Result;
import com.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/*
 * @ author 柠
 * @ 业务逻辑层接口
 */
public interface IBlogService extends IService<Blog> {

    Result queryHotBlog(Integer current);

    Result queryBlogById(Long id);

    Result likeBlog(Long id);

    Result queryBlogLikes(Long id);

    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);

}
