package com.example.menu_service.service;

import com.example.menu_service.model.Menu;
import com.example.menu_service.repo.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepo menuRepo;

    public List<Menu> viewmenu() {
        return menuRepo.findAll();
    }

    public Menu getMenuById(Long itemId) {
        return menuRepo.findById(itemId).orElse(null);
    }

    public Menu addMenu(Menu menu) {
        return menuRepo.save(menu);
    }

    public Menu updateMenu(Menu menu) {
        return menuRepo.save(menu);
    }
    public void deleteMenu(Long itemId) {

        menuRepo.deleteById(itemId);

    }

    public Menu getMenuByName(String itemName) {
        return  menuRepo.findByItemName(itemName);
    }
}
