package com.service;

import com.dto.Result;
import com.entity.Voucher;
import com.baomidou.mybatisplus.extension.service.IService;

/*
 * @ author 柠
 * @ 业务逻辑层接口
 */
public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
