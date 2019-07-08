package com.zte.jb.service.impl;

import com.zte.jb.dao.RunDao;
import com.zte.jb.entity.Run;
import com.zte.jb.entity.User;
import com.zte.jb.service.RunService;
import com.zte.jb.utils.CurrentDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 16:24
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class RunServiceImpl implements RunService{
    @Autowired
    private RunDao runDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public  List<Run> findAll(){
        return runDao.selectAll();
    }
    //查询所有跑步信息
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Run> findRunByUser(User user){
        return runDao.selectRunByUser(user);
    }
    //查询跑步信息
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeRun(Run run){
        return runDao.deleteRun(run);
    }
    //删除跑步信息
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addRun(Run run){
        run.setrCreateTime(CurrentDate.getCurrentDate());
        return runDao.insertRun(run);
    }
}
