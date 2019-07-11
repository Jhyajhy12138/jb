package com.zte.jb.controller;

import com.zte.jb.entity.User;
import com.zte.jb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/user",produces = {"application/json;charset=utf-8"})
@SessionAttributes(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public String login(@RequestParam("uTel")String uTel, @RequestParam("uPwd")String uPwd, Model model){
        User user = userService.login(uTel);
        model.addAttribute("user",user);
        if (uPwd.equals(user.getuPwd())){
            return "success";
        }else {
            return "fail";
        }
    }

}
