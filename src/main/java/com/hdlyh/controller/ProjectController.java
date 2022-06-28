package com.hdlyh.controller;

import com.hdlyh.po.Project;
import com.hdlyh.service.ProjectService;
import com.hdlyh.tools.json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.w3c.dom.ls.LSOutput;

import javax.lang.model.element.VariableElement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Controller
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @RequestMapping("/findAllProject.action")
    public void findAllProject(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        List<Project> allProject = projectService.findAllProject();
        json<Project> j = new json<>();
        String tojson = j.tojson(allProject);
        System.out.println(tojson);
        response.getWriter().write(tojson);
    }

    @RequestMapping("/findMyProject.action")
    public void findMyProject(HttpServletRequest request,HttpServletResponse response) throws IOException {
        int user_id =(int) request.getSession().getAttribute("user_id");
        response.setCharacterEncoding("utf-8");
        List<Project> allProject = projectService.findMyProject(user_id);
        json<Project> j = new json<>();
        String tojson = j.tojson(allProject);
        response.getWriter().write(tojson);
    }


    @RequestMapping("/addProject.action")
    public  void addProject(HttpServletRequest request , HttpServletResponse response) throws IOException {
       request.setCharacterEncoding("utf-8");
        int user_id =(int)request.getSession().getAttribute("user_id");
        String project_name = request.getParameter("project_name");
        String project_owner = request.getParameter("project_owner");
        String project_tel = request.getParameter("project_tel");
        String project_owner_info = request.getParameter("project_owner_info");
        String project_info = request.getParameter("project_info");

        Project project = new Project(project_name,project_owner,project_tel,project_owner_info,project_info);
        project.setProject_user_id(user_id);
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        project.setProject_apply_time(date);
        projectService.addProject(project);
        response.sendRedirect("./pages/myProject.jsp");
    }

    @RequestMapping("/delProject.action")
    public void delProject(HttpServletRequest request ,HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        int project_id = Integer.parseInt(request.getParameter("project_id"));
        System.out.println(project_id);
        projectService.deleteProject(project_id);
    }

    @RequestMapping("/editProject.action")
    public void editProject(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
         int project_id = Integer.parseInt(request.getParameter("project_id"));
         String project_name =request.getParameter("project_name");
         String project_info = request.getParameter("project_info");
         String project_owner_info = request.getParameter("project_owner_info");
        String project_owner = request.getParameter("project_owner");
        String project_tel = request.getParameter("project_tel");
        Project project = new Project();
        project.setProject_id(project_id);
        project.setProject_name(project_name);
        project.setProject_info(project_info);
        project.setProject_owner(project_owner);
        project.setProject_tel(project_tel);
        project.setProject_owner_info(project_owner_info);
        System.out.println(project);
        projectService.updateProject(project);
    }

}
