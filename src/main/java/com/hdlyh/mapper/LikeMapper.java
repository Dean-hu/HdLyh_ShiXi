package com.hdlyh.mapper;

import com.hdlyh.po.Like;
import com.hdlyh.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.util.List;

public interface LikeMapper {
    //根据用户id查询点赞记录
    @Select("select * from Like where like_user_id = #{like_user_id}")
    List<Like> findLikesByUserId(int like_user_id);
    //根据项目id查询点赞记录
    @Select("select * from Like where like_project_id = #{like_project_id}")
    List<Like> findLikesByProjectId(int like_project_id);
    //增加Like记录
    @Insert("insert into like(like_pro_id,like_time,like_user_id) values (#{like_pro_id},#{like_time},#{like_user_id})")
    Like addLike(Integer like_pro_id, Date like_time, Integer like_user_id);
    //删除点赞记录
    @Delete("delete from like where like_id = #{like_id}")
    void delete(Integer like_id);
}
