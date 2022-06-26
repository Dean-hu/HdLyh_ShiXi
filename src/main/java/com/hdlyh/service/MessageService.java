package com.hdlyh.service;

import com.hdlyh.po.Message;

import java.util.List;

public interface MessageService {
     List<Message> findMyMessage(int user_id);
}
