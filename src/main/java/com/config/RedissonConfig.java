package com.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
  @ author 柠
  @ 缓存中间件配置
 */

@Configuration
public class  RedissonConfig {


    @Bean
    public RedissonClient redissonClient(){
        // 配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.122.133:6379");
        // 创建RedissonClient对象
        return Redisson.create(config);
    }
}
