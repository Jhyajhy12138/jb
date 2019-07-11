package com.zte.jb.service;

import com.zte.jb.entity.Fitness;
import com.zte.jb.entity.User;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 17:00
 * Description:<描述>
 */
public interface FitnessService {
    public List<Fitness> findAll();
    //查找所有健身信息
    public List<Fitness> findFitnessByUser(User user);
    //查找健身信息
    public int addFitness(Fitness fitness);
    //添加健身信息
    public int removeFitness(Fitness fitness);
    //删除健身信息
}
