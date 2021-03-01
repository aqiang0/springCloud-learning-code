package com.aqiang.springcloud.controller;

import com.aqiang.springcloud.entities.CommonResult;
import com.aqiang.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    public static String PAYMENT_URL = "http://localhost:8001/payment/";

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/order/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){
        return restTemplate.getForObject(PAYMENT_URL+"getPaymentById/"+id,CommonResult.class);
    }

    @PostMapping("/order/create")
    public CommonResult create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"create/",payment,CommonResult.class);
    }
}
