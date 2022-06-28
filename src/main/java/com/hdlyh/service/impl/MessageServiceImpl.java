package com.hdlyh.service.impl;

import com.hdlyh.mapper.MessageMapper;
import com.hdlyh.po.Message;
import com.hdlyh.service.MessageService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
     @Autowired
    MessageMapper messageMapper;
    @Override
    public List<Message> findMyMessage(int user_id) {
        return messageMapper.findMyMessage( user_id);
    }

    @Override
    public void delMyMessageById(int message_id) {
          messageMapper.delMyMessageById(message_id);
    }

}
