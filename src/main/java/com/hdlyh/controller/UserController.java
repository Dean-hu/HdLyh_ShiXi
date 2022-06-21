package com.hdlyh.controller;

import com.hdlyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/creatUser.action")
    public ModelAndView createUser(){
        ModelAndView modelAndView =new ModelAndView();
        return modelAndView;
    }
}
