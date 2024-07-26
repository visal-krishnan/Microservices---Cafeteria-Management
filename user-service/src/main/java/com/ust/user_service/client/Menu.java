package com.ust.user_service.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Menu {

    private Long itemId;
    private String itemName;
    private double price;
    private int quantity;

}

