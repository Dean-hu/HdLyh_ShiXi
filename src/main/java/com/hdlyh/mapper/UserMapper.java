package com.hdlyh.mapper;

import com.hdlyh.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface UserMapper {
    //选择所有用户
    List<User> selectAllUser();
    //根据id查询user
    @Select("select * from user where user_id = #{user_id};")
    User findUserById(int user_id);
    //根据user_name查询user
    @Select("select * from user where user_name = #{user_name};")
    User findUserByName(String user_name);
    //注册用户，等级为0
    @Insert("insert into user(user_name, user_password,user_level) values(#{user_name},#{user_password},#{user_level})")
    int createUser(User user);
    //修改用户信息
    void changeUserInfo(User user);
    //根据删除用户
    @Select("delete from user where user_id = #{user_id};")
    void deleteUser(Integer user_id);
}
