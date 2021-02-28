package com.aqiang.springcloud.controller;

import com.aqiang.springcloud.entities.CommonResult;
import com.aqiang.springcloud.entities.Payment;
import com.aqiang.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/payment")
@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if (i > 0 ){
            return new CommonResult(200,"插入数据成功！");
        }
        return new CommonResult(400,"插入数据失败!");
    }

    @GetMapping(value = "/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null ){
            return new CommonResult(200,"success",payment);
        }
        return new CommonResult(400,"插入数据失败!");
    }
}
