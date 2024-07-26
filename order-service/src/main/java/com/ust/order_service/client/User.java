package com.ust.order_service.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long userId;
    private String username;
    private String fullName;
    private String email;
    private String role;
    private String joinDate;
    private String amountSpend;
    private String preferences;

}
