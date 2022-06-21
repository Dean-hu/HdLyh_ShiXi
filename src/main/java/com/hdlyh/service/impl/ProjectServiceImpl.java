package com.hdlyh.service.impl;

import com.hdlyh.mapper.ProjectMapper;
import com.hdlyh.po.Project;
import com.hdlyh.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectMapper projectMapper;
    @Override
    public Project findProjectById(int project_id) {
        return projectMapper.findProjectById(project_id);
    }

    @Override
    public List<Project> findAllProject() {
        return projectMapper.findAllProject();
    }

    @Override
    public int addProject(Project project) {
        return projectMapper.addProject(project);
    }
}
