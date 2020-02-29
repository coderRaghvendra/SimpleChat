package com.simplechat.server.model.dao;

import com.simplechat.db.SimpleChatDB;
import com.simplechat.server.model.entity.User;

import java.util.List;

/**
 * Created by raghvendra.mishra on 29/02/20.
 */
public class UserDao {

    public static void addUser(User user) {
        SimpleChatDB.getUsers().add(user);
        SimpleChatDB.getIdVsUser().put(user.getId(), user);
    }

    public static User getUserById(long id) {
        return SimpleChatDB.getIdVsUser().get(id);
    }

    public static List<User> getUsers() {
        return SimpleChatDB.getUsers();
    }
}
