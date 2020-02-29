package com.simplechat.server.model.dao;

/**
 * Created by raghvendra.mishra on 29/02/20.
 */
public class DaoManager {
    private static UserDao userDao = new UserDao();
    private static MessageDuoDao messageDuoDao = new MessageDuoDao();

    public static UserDao userDao() {
        return userDao;
    }

    public static MessageDuoDao messageDuoDao() {
        return messageDuoDao;
    }
}
