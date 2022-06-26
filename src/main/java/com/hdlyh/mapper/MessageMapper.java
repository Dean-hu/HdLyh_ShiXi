package com.hdlyh.mapper;

import com.hdlyh.po.Message;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MessageMapper {
    @Select("select user_name,project_name,message_content from user a join project b join message c " +
            "where a.user_id=c.message_user_id and b.project_id =c.message_project_id and a.user_id = #{user_id}")
     List<Message> findMyMessage(int user_id);
}
