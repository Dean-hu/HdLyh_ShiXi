package com.hdlyh.service;

import com.hdlyh.po.User;

public interface UserService {
    User findUserById(int id);
    int createUser(User user);
    User findUserByName(String user_name);
}
