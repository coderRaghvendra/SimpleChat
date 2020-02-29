package com.simplechat.server.model.dao;

import com.simplechat.db.SimpleChatDB;
import com.simplechat.server.model.entity.MessageDuo;

/**
 * Created by raghvendra.mishra on 29/02/20.
 */
public class MessageDuoDao {

    public static void addMessage(MessageDuo message) {
        SimpleChatDB.getMessageDuos().add(message);
    }

//    public static User getMessageBySenderIdNReceiverId(long id) {
//        return SimpleChatDB.getIdVsUser().get(id);
//    }
}
