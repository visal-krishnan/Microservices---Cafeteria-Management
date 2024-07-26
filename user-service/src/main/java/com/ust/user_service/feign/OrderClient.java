package com.ust.user_service.feign;

import com.ust.user_service.client.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="orderservice", url="http://localhost:2240/orders")
public interface OrderClient {
    @GetMapping("/vieworders/{userId}")
    public List<Order> viewOrdersById(@PathVariable  Long userId);
}
