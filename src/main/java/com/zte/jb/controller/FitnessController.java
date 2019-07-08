package com.zte.jb.controller;

import com.google.gson.Gson;
import com.zte.jb.entity.Fitness;
import com.zte.jb.entity.User;
import com.zte.jb.service.FitnessService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = {"/fitness"},produces = {"application/json,charset=utf-8"})
public class FitnessController {
    @Autowired
    private FitnessService fitnessService;

    @RequestMapping("/fitnessManager")
    public String fitnessManager(Model model){
        List<Fitness> fitnesses=fitnessService.findAll();
        model.addAttribute("fitnesses","fitnesses");
        return "/fitness/fitnessManager";//转到健身管理的jsp页面
    }

    @RequestMapping("/findByUser.do")//客户端查找健身信息
    @ResponseBody
    public Object findByuser(HttpServletRequest req){
        User user=new User();
        HttpSession session=req.getSession();
        user=(User)session.getAttribute("User");
        List<Fitness> fitnesses=fitnessService.findFitnessByUser(user);
        Map m=new HashMap();
        m.put("fitnesses",fitnesses);
        Gson gson=new Gson();
        return gson.toJson(m);
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public Object addFitness(HttpServletRequest req)  throws InvocationTargetException, IllegalAccessException{
        Fitness fitness=new Fitness();
        User user=new User();
        HttpSession session=req.getSession();
        user=(User)session.getAttribute("user");
        BeanUtils.populate(fitness,req.getParameterMap());
        fitness.setuId(user);
        fitnessService.addFitness(fitness);
        return "插入成功";
    }
    @RequestMapping("/delete.do")
    @ResponseBody
    public Object deleteFitness(HttpServletRequest req,Integer id)throws InvocationTargetException, IllegalAccessException{
        Map m=new HashMap();
        Gson gson=new Gson();
        try {
            Fitness fitness=new Fitness();

            fitness.setcId(id);
            fitnessService.removeFitness(fitness);
            m.put("msg","插入成功");
            return gson.toJson(m);
        }
        catch (Exception e){
            m.put("msg","插入失败");
            return gson.toJson(m);
        }
    }


}
