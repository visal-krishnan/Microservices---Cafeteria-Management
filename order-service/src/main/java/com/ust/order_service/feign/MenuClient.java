package com.ust.order_service.feign;

//import com.ust.user_service.client.Menu;
import com.ust.order_service.client.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="menuservice", url="http://localhost:2238/menu")
public interface MenuClient {


    @GetMapping("/viewmenu/{itemId}")
    Menu getMenuById(@PathVariable Long itemId);

    @GetMapping("{itemName}")
    Menu getMenuByName(@PathVariable String itemName);

}
