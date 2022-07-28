package com.feng.dao;

import com.feng.beans.SysUser;

public interface UserDao {
    SysUser findByUsername(String username);
}
