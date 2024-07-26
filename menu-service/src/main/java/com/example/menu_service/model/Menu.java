package com.example.menu_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemid")
    private Long itemId;
    @Column(name = "itemname")
    private String itemName;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;

}
