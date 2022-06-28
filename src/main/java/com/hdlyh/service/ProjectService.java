package com.hdlyh.service;

import com.hdlyh.po.Project;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProjectService {
    //根据id查询项目
    Project findProjectById(int project_id);
    //查询所有项目
    List<Project> findAllProject();
    //根据user_id查询我的项目
    List<Project> findMyProject(int user_id);
    //根据输入的模糊属性查询project信息
    List<Project> findProjectByCondition(Project project);
    //添加项目
    int addProject(Project project);
    //删除项目
    void deleteProject(Integer project_id);
    //更新项目
    void updateProject(Project peoject);
}
