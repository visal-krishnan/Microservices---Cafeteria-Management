package com.ust.user_service.feign;

import com.ust.user_service.client.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="menuservice", url="http://localhost:2238/menu")
public interface MenuClient {
    @GetMapping("/viewmenu")
    public List<Menu> viewmenu();
}
