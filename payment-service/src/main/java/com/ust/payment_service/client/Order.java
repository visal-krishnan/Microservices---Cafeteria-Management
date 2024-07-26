package com.ust.payment_service.client;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long orderId;
    private Long userId;
    private double totalAmount;
    private String status;
    private String paymentStatus;
}
