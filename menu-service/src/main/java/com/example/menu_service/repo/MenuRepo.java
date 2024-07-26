package com.example.menu_service.repo;

import com.example.menu_service.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu,Long> {
    Menu findByItemName(String itemName);
}
