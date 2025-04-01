package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Voucher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * @ author 柠
 * @ Mapper底层接口实现
 */
public interface VoucherMapper extends BaseMapper<Voucher> {

    List<Voucher> queryVoucherOfShop(@Param("shopId") Long shopId);
}
