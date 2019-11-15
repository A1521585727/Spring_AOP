package com.baizhi.rlt.dao.impl;

import com.baizhi.rlt.dao.UserDao;
import com.baizhi.rlt.entity.User;

public class UserDaoImpl implements UserDao {
    @Override
    public void insert(User user) {
        System.out.println("This in UserDao....");
    }
}
