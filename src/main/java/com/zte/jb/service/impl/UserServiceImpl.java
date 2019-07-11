package com.zte.jb.service.impl;

import com.zte.jb.dao.UserDao;
import com.zte.jb.entity.User;
import com.zte.jb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User login(String uTel){
        return userDao.login(uTel);
    }
}
