package com.simplechat.server.service;

import com.simplechat.server.model.dao.DaoManager;
import com.simplechat.server.model.entity.User;

import java.util.List;

/**
 * Created by raghvendra.mishra on 29/02/20.
 */
public class UserService {

    public static User getUserById(long id) {
        return DaoManager.userDao().getUserById(id);
    }

    public static List<User> getAllUsers() {
        return DaoManager.userDao().getUsers();
    }

    public static void addUser(String name) {
        User user = new User();
        user.setId(3);
        user.setName(name);
        DaoManager.userDao().addUser(user);
    }
}
