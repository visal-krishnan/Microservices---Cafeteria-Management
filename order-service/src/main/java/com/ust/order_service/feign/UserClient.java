package com.ust.order_service.feign;

import com.ust.order_service.client.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="userservice", url="http://localhost:2239/users")
public interface UserClient {

    @GetMapping("/getuser/{userId}")
     User getUserById(@PathVariable Long userId);

}
