package com.hdlyh.mapper;

import com.hdlyh.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserMapper {
    @Select("select * from user where user_id = #{user_id};")
    User findUserById(int user_id);
    @Select("select * from user where user_name = #{user_name};")
    User findUserByName(String user_name);
    @Insert("insert into user(user_name, user_password,user_level) values(#{user_name},#{user_password},#{user_level})")
    int createUser(User user);
}
