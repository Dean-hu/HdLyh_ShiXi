package com.hdlyh.service.impl;

import com.hdlyh.mapper.UserMapper;
import com.hdlyh.po.User;
import com.hdlyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User findUserById(int user_id) {
        return userMapper.findUserById(user_id);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public User findUserByName(String user_name) {
        return userMapper.findUserByName(user_name);
    }


}
