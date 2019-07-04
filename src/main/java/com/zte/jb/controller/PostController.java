package com.zte.jb.controller;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value={"/post"},produces = "text/plain;charset=utf-8")
/*@RequestMapping("/post")*/
public class PostController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @ResponseBody
    @RequestMapping("/loginGoogle")
    public Object loginGoogle(@RequestParam("cname")String cname,@RequestParam("cpassword")String cpassword){
        Gson gson = new Gson();
        if (cname.equals("admin")&&cpassword.equals("123")){
            String ans = gson.toJson("Google登陆成功");
            return ans;
        }else {
            String ans = gson.toJson("Google登陆失败");
            return ans;
        }
    }

    @ResponseBody
    @RequestMapping("/loginAli")
    public Object loginAli(@RequestParam("cname")String cname,@RequestParam("cpassword")String cpassword){

        if (cname.equals("admin")&&cpassword.equals("123")){
            return JSON.toJSONString("Ali登陆成功");

        }else {
            return JSON.toJSONString("Ali登陆失败");
        }
    }



}
