package com.hdlyh.mapper;

import com.hdlyh.po.Project;
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
      //添加项目
      int addProject(Project project);
}
