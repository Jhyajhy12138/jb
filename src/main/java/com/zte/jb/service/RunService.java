package com.zte.jb.service;

import com.zte.jb.entity.Run;
import com.zte.jb.entity.User;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 16:29
 * Description:<描述>
 */
public interface RunService {
    public List<Run> findRunByUser(User user);
    //查找跑步信息
    public int addRun(Run run);
    //添加跑步信息
    public int removeRun(Run run);
    //删除跑步信息
}
