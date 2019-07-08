package com.zte.jb.dao;

import com.zte.jb.entity.Fitness;
import com.zte.jb.entity.User;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 16:34
 * Description:<描述>
 */
public interface FitnessDao {
    public List<Fitness> selectAll();
    //查找所有健身信息
    public List<Fitness> selectFitnessByUser(User user);
    //根据用户查找健身记录
    public int insertFitness(Fitness fitness);
    //插入健身记录
    public int deleteFitness(Fitness fitness);
    //删除健身记录
}
