package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entitles.Payment;

/**
 * @author BinYi
 * @create 2020-09-11 21:32
 */
public interface PaymentService {
    Payment findById(Long id);
}
