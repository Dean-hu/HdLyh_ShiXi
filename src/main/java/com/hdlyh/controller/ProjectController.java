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
        System.out.println(tojson);
        response.getWriter().write(tojson);
    }


    @RequestMapping("/addProject.action")
    public  void addProject(HttpServletRequest request , HttpServletResponse response) throws IOException {
       request.setCharacterEncoding("utf-8");
        System.out.println(request.getParameter("project_name"));
        System.out.println(request.getParameter("project_owner"));
        System.out.println(request.getParameter("project_tel"));
       response.sendRedirect("./pages/myProject.jsp");
    }

}
