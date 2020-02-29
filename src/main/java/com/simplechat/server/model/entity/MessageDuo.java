package com.simplechat.server.model.entity;

import java.time.LocalDateTime;

/**
 * Created by raghvendra.mishra on 29/02/20.
 */
public class MessageDuo {
    private long id;
    private long senderId;
    private long receiverId;
    private LocalDateTime time;

    public long getId() {
        return id;
    }

    public long getSenderId() {
        return senderId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
