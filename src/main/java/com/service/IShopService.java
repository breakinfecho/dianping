package com.service;

import com.dto.Result;
import com.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/*
 * @ author 柠
 * @ 业务逻辑层接口
 */
public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
