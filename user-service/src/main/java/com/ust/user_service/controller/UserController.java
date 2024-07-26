package com.ust.user_service.controller;

import com.ust.user_service.client.Menu;
import com.ust.user_service.client.Order;
import com.ust.user_service.model.User;
import com.ust.user_service.service.UserService;

import jakarta.ws.rs.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {

        return userService.addUser(user);

    }

    @GetMapping("/getusers")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/getuser/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable Long id) {
       userService.deleteUser(id);
    }

    @GetMapping("/viewmenu")
    public List<Menu> viewMenu() {
        return userService.viewMenu();
    }

    @GetMapping("/vieworders/{userId}")
    public List<Order> viewOrdersById(@PathVariable Long userId){
        return userService.viewOrdersById(userId);
    }




}
