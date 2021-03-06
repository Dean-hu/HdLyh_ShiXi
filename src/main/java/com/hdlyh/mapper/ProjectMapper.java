package com.hdlyh.mapper;

import com.hdlyh.po.Project;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ProjectMapper {
      //根据id查询项目
      @Select("select * from project where project_id = #{project_id}")
      Project findProjectById(int project_id);
      //查询所有项目
      @Select("select * from project")
      List<Project> findAllProject();
      //根据user_id查询我的项目
      @Select("select * from project where project_user_id  = #{user_id}")
      List<Project> findMyProject(int user_id);
      //根据输入的模糊属性查询project信息
      List<Project> findProjectByCondition(Project project);
      //添加项目
      int addProject(Project project);
      //删除项目
      @Delete("delete from project where project_id = #{project_id}")
      void deleteProject(Integer project_id);
      //更新项目
      void updateProject(Project peoject);
}
