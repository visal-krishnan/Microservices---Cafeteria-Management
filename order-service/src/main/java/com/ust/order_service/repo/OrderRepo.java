package com.ust.order_service.repo;

import com.ust.order_service.client.Menu;
import com.ust.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order,Long> {
//    Menu findByItemName(String itemName);
List<Order> findByUserId(Long userId);

   // Order findByOrderId(Long orderId);
}
