package com.zte.jb.controller;

import com.alibaba.fastjson.JSON;
import com.zte.jb.entity.Post;
import com.zte.jb.entity.User;
import com.zte.jb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping(value={"/post"},produces = "text/plain;charset=utf-8")
//@SessionAttributes(value = "user")
public class PostController {
    @Autowired
    private PostService postService;

    @ResponseBody
    @RequestMapping("/addPost")
    public Object addPost(HttpServletRequest request) {
        HttpSession session = request.getSession();
        try {
//            Integer uId = ((User)session.getAttribute("user")).getuId();
            Integer uId = Integer.parseInt(request.getParameter("uId"));
            byte[] pContent = request.getParameter("pContent").getBytes("utf-8");
            String pImage = request.getParameter("pImage");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateTime = sdf.format(new Date());
            String pCreateTime = dateTime;
            Post post = new Post(uId,pContent,pImage,pCreateTime);
            postService.addPost(post);
            return "success";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @ResponseBody
    @RequestMapping("/showAllPosts")
    public Object showAllPosts(){
        List<Post> posts = postService.findAllPosts();
        List list = new ArrayList();
        Iterator iterator = posts.iterator();
        try {
            while (iterator.hasNext()){
                Map map =(Map) iterator.next();
                String s = new String((byte[])map.get("pContent"),"utf-8");
                map.put("pContent",s);
                list.add(map);
            }
            return JSON.toJSONString(list);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "fail";
        }
    }

    /*@RequestMapping("/login")
    public String login(@RequestParam("uTel")String uTel,@RequestParam("uPwd")String uPwd,Model model){
        User user = postService.login(uTel);
        System.out.println(user);
        model.addAttribute("user",user);
        if (uPwd.equals(user.getuPwd())){
            return "test";
        }else {
            return "fail";
        }
    }*/

    @RequestMapping("/fail")
    public String fail(){
        return "fail";
    }

    @ResponseBody
    @RequestMapping("/test")
    public Object test(HttpServletRequest request){
        HttpSession session = request.getSession();
        return JSON.toJSONString(((User)session.getAttribute("user")).getuId());
    }
}
