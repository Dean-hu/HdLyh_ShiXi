package com.hdlyh.controller;

import com.hdlyh.po.Message;
import com.hdlyh.po.Project;
import com.hdlyh.service.MessageService;
import com.hdlyh.tools.json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class MessageController {

    @Autowired
    MessageService messageService;
    @RequestMapping("/findMyMessage.action")
    public  void findMyMessage(HttpServletRequest request , HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        int user_id = (int)request.getSession().getAttribute("user_id");
        List<Message> myMessage = messageService.findMyMessage(user_id);
        json<Message> j = new json<>();
        String tojson = j.tojson(myMessage);
        System.out.println(tojson);
        response.getWriter().write(tojson);
    }
    @RequestMapping("/delMessage.action")
    public void delMessage(HttpServletRequest request , HttpServletResponse response) throws IOException{
           request.setCharacterEncoding("utf-8");
        System.out.println("sadfsdsdgfdgdfs");
        int message_id = Integer.parseInt(request.getParameter("message_id"));
        System.out.println(message_id);
        messageService.delMyMessageById(message_id);
    }
}
