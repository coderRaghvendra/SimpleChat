package com.simplechat.server.controller;

import com.simplechat.server.model.entity.User;
import com.simplechat.server.service.UserService;

import java.util.List;

/**
 * Created by raghvendra.mishra on 29/02/20.
 */
public class UserController {

    public static boolean addUser(String name) {
        UserService.addUser(name);
        return true;
    }

    public static List<User> getAllUser() {
        return UserService.getAllUsers();
    }
}
