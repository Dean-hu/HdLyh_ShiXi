package com.hdlyh.mapper;

import com.hdlyh.po.Like;
import com.hdlyh.po.User;

import java.sql.Date;
import java.util.List;

public interface LikeMapper {
    //根据用户id查询点赞记录
    List<Like> findLikesByUserId(int id);
    //根据用户name查询点赞记录
    List<Like> findLikesByUserName(String name);
    //根据项目id查询点赞记录
    List<Like> findLikesByProjectId(int id);
    //根据项目name查询点赞记录
    List<Like> findLikesByProjectId(String name);

    //增加Like记录
    Like createLike(Integer like_pro_id, Date like_time, Integer like_user_id);
    User findUserByName(String user_name);
}
