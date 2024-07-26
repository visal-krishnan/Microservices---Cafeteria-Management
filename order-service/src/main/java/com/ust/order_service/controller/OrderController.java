package com.ust.order_service.controller;

import com.ust.order_service.client.Menu;
import com.ust.order_service.model.Order;
import com.ust.order_service.model.OrderItem;
import com.ust.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/addorder")
    public Order addOrder(@RequestParam Long userId, @RequestBody OrderItem orderItem) {
      return  orderService.addOrder(userId,orderItem);
    }

    @GetMapping("/vieworders")
    public List<Order> viewOrders() {
        return orderService.viewOrders();
    }
//    @PostMapping("/additems/{itemName}")
//    public Menu  addItems(@PathVariable String itemName) {
//
//        return orderService.addItems(itemName);
//
//    }

    @GetMapping("/getorder/{orderId}")
    public Order getOrder(@PathVariable Long orderId) {
        return orderService.getOrder(orderId);
    }

    @GetMapping("/vieworders/{userId}")
    public List<Order> viewOrdersById(@PathVariable  Long userId){
        return orderService.viewOrdersById(userId);
    }



}
