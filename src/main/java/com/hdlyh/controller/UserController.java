package com.hdlyh.controller;

import com.hdlyh.po.User;
import com.hdlyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/userRegister.action")
    public ModelAndView createUser(HttpServletRequest request , HttpServletResponse response){
        ModelAndView modelAndView =new ModelAndView();
        String user_name = request.getParameter("user_name");
        String user_password  =request.getParameter("user_password");
        User user = new User(user_name,user_password,0);
        /*如果该用户名未被使用*/
        if(userService.findUserByName(user_name)!=null)
        {
            modelAndView.setViewName("login.jsp");
        }else{/*该用户名被使用*/
            modelAndView.addObject("msg","该用户名已被使用，请重试");
            modelAndView.setViewName("register.jsp");
        }
        return modelAndView;
    }






/*    @RequestMapping("/userLogin.action")
    public ModelAndView createUser(){
        ModelAndView modelAndView =new ModelAndView();
        return modelAndView;
    }*/
}
