package com.simplechat.db;

import com.simplechat.server.model.entity.MessageDuo;
import com.simplechat.server.model.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by raghvendra.mishra on 29/02/20.
 */
public class SimpleChatDB {
    private static List<User> users = new ArrayList<User>();
    private static Map<Long, User> idVsUser = new HashMap<Long, User>();
    private static List<MessageDuo> messageDuos = new ArrayList<MessageDuo>();

    public static List<User> getUsers() {
        return users;
    }

    public static Map<Long, User> getIdVsUser() {
        return idVsUser;
    }

    public static List<MessageDuo> getMessageDuos() {
        return messageDuos;
    }
}
