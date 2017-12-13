package com.liujiaming.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.liujiaming.model.user_t;
import com.liujiaming.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @author liujm
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        user_t user = userService.getUserById(userId);
        //个人理解传整个user,然后jsp选择调用,比如这个选择调用userName
        model.addAttribute("user", user);
        return "showUser";
    }
}