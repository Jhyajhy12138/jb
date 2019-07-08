package com.zte.jb.dao;

import com.zte.jb.entity.Run;
import com.zte.jb.entity.User;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 16:34
 * Description:<描述>
 */
public interface RunDao {
    public List<Run> selectAll();
    //查找所有跑步信息
    public List<Run> selectRunByUser(User user);
    //根据用户查找跑步记录
    public int insertRun(Run run);
    //插入跑步记录
    public int deleteRun(Run run);
    //删除跑步记录
}
