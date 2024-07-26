package com.ust.user_service.service;

import com.ust.user_service.client.Menu;
import com.ust.user_service.client.Order;
import com.ust.user_service.feign.MenuClient;
import com.ust.user_service.feign.OrderClient;
import com.ust.user_service.model.User;
import com.ust.user_service.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MenuClient menuClient;

    @Autowired
    private OrderClient orderClient;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<Menu> viewMenu() {
        return menuClient.viewmenu();

    }


    public List<Order> viewOrdersById(Long userId) {
        return orderClient.viewOrdersById(userId);
    }
}
