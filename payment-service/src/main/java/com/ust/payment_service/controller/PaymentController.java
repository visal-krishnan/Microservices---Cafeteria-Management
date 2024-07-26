package com.ust.payment_service.controller;

import com.ust.payment_service.model.Payment;
import com.ust.payment_service.service.PaymentService;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("{orderId}")
    public Payment getPayment(@PathVariable Long orderId) {
         return paymentService.getPayment(orderId);
    }
}
