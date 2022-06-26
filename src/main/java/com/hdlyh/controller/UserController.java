package com.hdlyh.controller;

import com.hdlyh.po.User;
import com.hdlyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.ActionMapUIResource;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/userRegister.action")
    public void  createUser(HttpServletRequest request , HttpServletResponse response) throws IOException {

        String user_name = request.getParameter("user_name");
        String user_password  =request.getParameter("user_password");
        System.out.println(user_name+user_password);
        User user = new User(user_name,user_password,0);
        /*如果该用户名未被使用*/
        if(userService.findUserByName(user_name)==null)
        {
              userService.createUser(user);
              request.getSession().setAttribute("msg","注册成功");
              response.sendRedirect("./pages/login.jsp");
        }else{/*该用户名被使用*/
            request.getSession().setAttribute("msg","用户名已被占用");
            response.sendRedirect("./pages/register.jsp");
        }
    }

    @RequestMapping("/userLogin.action")
    public void  UserLogin(HttpServletRequest request , HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        String user_name = request.getParameter("user_name");
        String user_password  =request.getParameter("user_password");
        System.out.println(user_name+user_password);
        User user = userService.findUserByName(user_name);
        System.out.println(user);
        String pwd = user.getUser_password();
        if(pwd.equals(user_password)){
            request.getSession().setAttribute("user_id",user.getUser_id());
            response.sendRedirect("./pages/MyMenu.jsp");
        }
        else{
            request.getSession().setAttribute("msg","用户名或密码错误");
            response.sendRedirect("./pages/login.jsp");
        }
    }
}
