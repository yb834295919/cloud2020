package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entitles.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BinYi
 * @create 2020-09-11 21:33
 */
@Service
public class PaymentService implements com.atguigu.springcloud.service.PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment findById(Long id) {
        return paymentDao.findById(id);
    }
}
