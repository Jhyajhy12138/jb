package com.zte.jb.controller;

import com.google.gson.Gson;
import com.zte.jb.entity.Run;
import com.zte.jb.entity.User;
import com.zte.jb.service.RunService;
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
@RequestMapping("/run")
public class RunController {
    @Autowired
    private RunService runService;

    @RequestMapping("/runManager")
    public String runManager(Model model){
        List<Run> runs=runService.findAll();
        model.addAttribute("runs",runs);
        return "/run/runManager";
    }

    @RequestMapping("/findByUser.do")
    @ResponseBody
    public String findByUser(HttpServletRequest req){
        HttpSession session=req.getSession();
        User user=new User();
        user=(User)session.getAttribute("user");
        List<Run> runs=runService.findRunByUser(user);
        Gson gson=new Gson();
        Map m=new HashMap();
        m.put("runs",runs);
        return gson.toJson(m);
    }

    @RequestMapping("/insert.do")
    @ResponseBody
    public String insert(HttpServletRequest req)throws InvocationTargetException, IllegalAccessException{
        HttpSession session=req.getSession();
        User user=new User();
        user=(User)session.getAttribute("user");
        Run run=new Run();
        BeanUtils.populate(run,req.getParameterMap());
        Gson gson=new Gson();
        run.setuId(user);
        runService.addRun(run);
        Map m=new HashMap();
        m.put("msg","插入成功");
        return gson.toJson(m);
    }

    @RequestMapping("/delete.do")
    @ResponseBody
    public String delete(Integer id)throws InvocationTargetException, IllegalAccessException{
        try {
            Run run = new Run();

            run.setrId(id);
            runService.removeRun(run);
            Map m = new HashMap();
            m.put("msg","删除成功");
            Gson gson=new Gson();
            return gson.toJson(m);
            }
        catch (Exception e){
            Map m=new HashMap();
            Gson gson=new Gson();
            m.put("msg","插入失败");
            return gson.toJson(m);
        }

    }
}
