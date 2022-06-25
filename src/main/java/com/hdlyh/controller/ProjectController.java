package com.hdlyh.controller;

import com.hdlyh.po.Project;
import com.hdlyh.service.ProjectService;
import com.hdlyh.tools.json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.w3c.dom.ls.LSOutput;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    @RequestMapping("/addProject.action")
    public  String addProject(HttpServletRequest request , HttpServletResponse response){
        System.out.println(request.getParameter("username"));

        return "./pages/visitorProject.jsp";
    }

}
