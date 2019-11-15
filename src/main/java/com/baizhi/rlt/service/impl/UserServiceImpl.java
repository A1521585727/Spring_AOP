package com.baizhi.rlt.service.impl;

import com.baizhi.rlt.dao.UserDao;
import com.baizhi.rlt.entity.User;
import com.baizhi.rlt.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
