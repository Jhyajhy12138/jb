package com.zte.jb.dao;

import com.zte.jb.entity.Fitness;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 16:34
 * Description:<描述>
 */
public interface FitnessDao {
    public List<Fitness> selectFitnessByUser(User user);
}
