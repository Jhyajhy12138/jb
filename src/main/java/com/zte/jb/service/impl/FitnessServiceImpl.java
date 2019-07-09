package com.zte.jb.service.impl;

import com.zte.jb.dao.FitnessDao;
import com.zte.jb.entity.Fitness;
import com.zte.jb.entity.Run;
import com.zte.jb.entity.User;
import com.zte.jb.service.FitnessService;
import com.zte.jb.utils.CurrentDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 17:00
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class FitnessServiceImpl implements FitnessService{
    @Autowired
    private FitnessDao fitnessDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Fitness> findAll(){
        return fitnessDao.selectAll();
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Fitness> findFitnessByUser(User user){
        return fitnessDao.selectFitnessByUser(user);
    }
    //根据用户查询健身信息

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeFitness(Fitness fitness){
        return fitnessDao.deleteFitness(fitness);
    }
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addFitness(Fitness fitness){
        fitness.setfCreateTime(CurrentDate.getCurrentDate());
        return fitnessDao.insertFitness(fitness);
    }

}
