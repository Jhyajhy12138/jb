package com.zte.jb.test;

import com.zte.jb.dao.RunDao;
import com.zte.jb.entity.Run;
import com.zte.jb.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-08 15:11
 * Description:<描述>
 */
public class Runtest {
    public static RunDao runDao;
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-dao.xml");
        runDao=(RunDao)context.getBean(RunDao.class);
        //insert();
        //selectAll();
        //selectById();
        delete();

    }

    public static void insert(){
        Run run=new Run();
        User user=new User();
        user.setuId(1);
        run.setuId(user);
        run.setrId(1);
        run.setrJourney(40);
        run.setrTime("40");
        runDao.insertRun(run);
    }

    public static void selectAll(){
        List<Run> runs=runDao.selectAll();
        for (Run run:runs){
            System.out.println(run);
        }
    }

    public static void selectById(){
        User user=new User();
        user.setuId(1);
        Run run=new Run();
        run.setuId(user);
        List<Run> runs=runDao.selectRunByUser(user);
        for(Run run1:runs){
            System.out.println(run1);
        }
    }

    public static void delete(){
        Run run=new Run();
        run.setrId(1);
        runDao.deleteRun(run);
    }
}
