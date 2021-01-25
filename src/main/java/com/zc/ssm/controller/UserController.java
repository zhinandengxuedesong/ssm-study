package com.zc.ssm.controller;

import com.zc.ssm.pojo.User;
import com.zc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="find/{id}",produces = "text/html;charset=utf-8") // Get 请求
    @ResponseBody //不做为逻辑视图
    public String findUserId(@PathVariable("id") int id, Model model){
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        System.out.println(user.toString());
        return user.toString();
    }

    @RequestMapping(value="/selAllJSON.action")
    @ResponseBody
    public List<User> selAllUserJson(){
        List<User> users = userService.selAll();
        for (User u: users) {
            System.out.println(u.toString());
        }
        return users;
    }

    @RequestMapping(value="/selAllShowTable.action",produces = "text/html;charset=utf-8")
//    @ResponseBody // 不作为逻辑视图
    public ModelAndView selAllUserTable(){
        ModelAndView mv = new ModelAndView();
        List<User> users = userService.selAll();
        for (User u: users) {
            System.out.println(u.toString());
        }
        mv.addObject("list", users);
        mv.setViewName("show"); // 逻辑视图，跳转到 WEB-INF/jsp/show.jsp
        return mv;
    }
}
