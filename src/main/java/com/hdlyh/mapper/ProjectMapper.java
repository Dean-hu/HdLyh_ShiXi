package com.hdlyh.mapper;

import com.hdlyh.po.Project;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ProjectMapper {
      @Select("select * from project where project_id = #{project_id}")
      Project findProjectById(int project_id);
      @Select("select * from project")
      List<Project> findAllProject();
      @Insert("insert into project(project_name, project_owner, project_tel, project_owner_info, project_info, project_apply_time, project_user_id, project_Check1, Project_Check_time1, Project_Check2, Project_Check_time2) " +
              "values(#{project_name},#{project_owner},#{project_tel},#{project_owner_info},#{project_info},#{project_apply_time},#{project_user_id},#{project_check1},#{project_check_time1},#{project_check2},#{project_check_time2})")
      int addProject(Project project);
}
