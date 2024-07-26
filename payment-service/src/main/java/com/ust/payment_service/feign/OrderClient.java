package com.ust.payment_service.feign;


import com.ust.payment_service.client.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="orderservice", url="http://localhost:2240/orders")
public interface OrderClient {

    @GetMapping("/getorder/{orderId}")
    public Order getOrder(@PathVariable Long orderId);
}
