package com.feng.service;

import com.feng.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getByMap(Map<String, Object> map);

    User getById(Integer id);

    User create(User user);

    User update(User user);

    int delete(Integer id);

    User getByUserName(String userName);
}