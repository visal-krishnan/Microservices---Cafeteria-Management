package com.example.menu_service.controller;

import com.example.menu_service.model.Menu;
import com.example.menu_service.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @PostMapping("/addmenu")
    public Menu addMenu(@RequestBody Menu menu){
        return menuService.addMenu(menu);
    }

    @PutMapping("/updatemenu")
    public Menu updateMenu(@RequestBody Menu menu){
        return menuService.updateMenu(menu);
    }

//    @GetMapping("/viewmenu")
//    public List<Menu> getMenuList(){
//        return menuService.viewmenu();
//    }

    @GetMapping("/viewmenu/{itemId}")
    public Menu getMenuById(@PathVariable Long itemId){
        return menuService.getMenuById(itemId);
    }

    @GetMapping("{itemName}")
    public Menu getMenuByName(@PathVariable String itemName){
        return menuService.getMenuByName(itemName);
    }

    @DeleteMapping("/deletemenu/{id}")
    public void deleteMenu(@PathVariable Long itemId)
    {
        menuService.deleteMenu(itemId);
    }
}
