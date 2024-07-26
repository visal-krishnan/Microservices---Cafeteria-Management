package com.ust.payment_service.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId")
    private Long paymentId;
    @Column(name = "orderId")
    private Long orderId;
    @Column (name="userId")
    private Long userId;
    @Column (name="totalAmount")
    private double totalAmount;
    @Column (name="paymentStatus")
    private String paymentStatus;


}
