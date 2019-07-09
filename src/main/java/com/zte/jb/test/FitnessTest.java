package com.zte.jb.test;

import com.zte.jb.dao.FitnessDao;
import com.zte.jb.entity.Fitness;
import com.zte.jb.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-08 8:30
 * Description:<描述>
 */
public class  FitnessTest {
    public static FitnessDao fitnessDao;

    public static void main(String []args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-dao.xml");

        fitnessDao=(FitnessDao)context.getBean(FitnessDao.class);
        //selectAll();
        //insertFitness();
        //selectByUser();
        deleteFitness();

    }

    public static void selectAll(){
        List<Fitness> fitnesses=fitnessDao.selectAll();
        for(Fitness fitnesses1:fitnesses){
            System.out.println(fitnesses1);
        }
    }

    public static void selectByUser(){
        User user=new User();
        user.setuId(1);
        List<Fitness> fitnesses=fitnessDao.selectFitnessByUser(user);
        for (Fitness fitnesses1:fitnesses){
            System.out.println(fitnesses1);
        }
    }

    public static void insertFitness(){
        Fitness fitness=new Fitness();
        User user=new User();
        user.setuId(1);
        fitness.setfId(1);
        fitness.setcId(1);
        fitness.setuId(user);
        fitness.setfTime("40");
        fitnessDao.insertFitness(fitness);
    }

    public static void deleteFitness(){
        Fitness fitness=new Fitness();
        fitness.setfId(1);
        fitnessDao.deleteFitness(fitness);
    }
}
