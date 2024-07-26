package com.ust.order_service.service;

import com.netflix.discovery.converters.Auto;
import com.ust.order_service.client.Menu;
import com.ust.order_service.client.User;
import com.ust.order_service.feign.MenuClient;
import com.ust.order_service.feign.UserClient;
import com.ust.order_service.model.Order;
import com.ust.order_service.model.OrderItem;
import com.ust.order_service.repo.OrderItemRepo;
import com.ust.order_service.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepo repo;

    @Autowired
    private OrderItemRepo itemRepo;

    @Autowired
    private MenuClient menuClient;

    @Autowired
    private UserClient userClient;

    public Order addOrder(  Long userId, OrderItem orderItem) {

        Order order = new Order();
        User u = userClient.getUserById(userId);

        if ( u != null) {
            order.setUserId(userId);
            order.setPaymentStatus("Processing");
            order.setStatus("Preparing");
        }
        orderItem.setItemId(menuClient.getMenuByName(orderItem.getItemName()).getItemId());
        orderItem.setPrice(menuClient.getMenuByName(orderItem.getItemName()).getPrice());
        order.setTotalAmount(orderItem.getPrice()*orderItem.getQuantity() + order.getTotalAmount());


        Order savedOrder = repo.save(order);
        OrderItem savedItem = itemRepo.save(orderItem);
        return savedOrder;


    }

    public List<Order> viewOrders() {
        return repo.findAll();
    }

    public List<Order> viewOrdersById(Long userId) {
        return repo.findByUserId(userId);
    }

    public Order getOrder(Long orderId) {
        return repo.findById(orderId).orElse(null);
    }

//    public Menu addItems(String itemName) {
//        return repo.findByItemName(itemName);
//
//    }
}
