package com.hdlyh.service;

import com.hdlyh.po.Project;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProjectService {

    Project findProjectById(int project_id);

    List<Project> findAllProject();

    int addProject(Project project);

    List<Project> findMyProject(int user_id);
}
