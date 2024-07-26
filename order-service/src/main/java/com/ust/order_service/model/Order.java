package com.ust.order_service.model;

import com.ust.order_service.client.Menu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private Long orderId;
    @Column(name = "userid")
    private Long userId;
    @Column(name = "totalamount")
    private double totalAmount=0;
    @Column(name = "status")
    private String status;
    @Column(name="paymentStatus")
    private String paymentStatus;



}
