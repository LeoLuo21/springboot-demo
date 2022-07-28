package com.feng.service.impl;

import com.feng.bean.User;
import com.feng.dao.UserDao;
import com.feng.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@DubboService(protocol = {"dubbo"}, validation = "false")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getByMap(Map<String, Object> map) {
        return userDao.getByMap(map);
    }

    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public User create(User user) {
        userDao.create(user);
        return user;
    }

    @Override
    public User update(User user) {
        userDao.update(user);
        return user;
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public User getByUserName(String userName) {
        return userDao.getByUserName(userName);
    }

}