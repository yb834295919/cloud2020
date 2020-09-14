package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entitles.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author BinYi
 * @create 2020-09-11 21:31
 */
@Mapper
public interface PaymentDao {

    Payment findById(Long id);
}
