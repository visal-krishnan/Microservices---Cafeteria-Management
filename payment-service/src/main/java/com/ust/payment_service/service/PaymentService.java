package com.ust.payment_service.service;

import com.ust.payment_service.feign.OrderClient;
import com.ust.payment_service.model.Payment;
import com.ust.payment_service.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepo repo;

    @Autowired
    private OrderClient orderClient;

    public Payment getPayment(Long orderId) {

        Payment payment = new Payment();

        payment.setOrderId(orderId);
        payment.setUserId(orderClient.getOrder(orderId).getUserId());
        orderClient.getOrder(orderId).setPaymentStatus("Success");
        payment.setPaymentStatus("Success");
        payment.setTotalAmount(orderClient.getOrder(orderId).getTotalAmount());



        return  repo.save(payment);

    }
}
