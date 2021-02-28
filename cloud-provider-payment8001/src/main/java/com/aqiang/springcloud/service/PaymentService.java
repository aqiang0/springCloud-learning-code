package com.aqiang.springcloud.service;

import com.aqiang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int create(Payment payment);
    Payment getPaymentById(@Param("id") long id);
}
