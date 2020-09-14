package com.atguigu.springcloud;

import com.atguigu.springcloud.entitles.CommonResult;
import com.atguigu.springcloud.entitles.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author BinYi
 * @create 2020-09-12 08:36
 */
@RestController
@RequestMapping("/payment")
public class controller {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/findById/{id}")
    public CommonResult<Payment> findById(@PathVariable(value = "id") Long id){
        Payment payment = paymentService.findById(id);
        if(payment!=null){
            return new CommonResult<Payment>(200,"查询成功",payment);
        }else {
            return new CommonResult<>(400,"查询失败");
        }

    }
}
