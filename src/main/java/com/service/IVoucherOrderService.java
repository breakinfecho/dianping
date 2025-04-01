package com.service;

import com.dto.Result;
import com.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/*
 * @ author 柠
 * @ 业务逻辑层接口
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);

    void createVoucherOrder(VoucherOrder voucherOrder);
}
