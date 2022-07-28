package com.feng.service.impl;


import com.feng.bean.Permission;
import com.feng.dao.PermissionDao;
import com.feng.service.PermissionService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@DubboService(protocol = {"dubbo"}, validation = "false")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<Permission> getByMap(Map<String, Object> map) {
        return permissionDao.getByMap(map);
    }

    @Override
    public Permission getById(Integer id) {
        return permissionDao.getById(id);
    }

    @Override
    public Permission create(Permission permission) {
        permissionDao.create(permission);
        return permission;
    }

    @Override
    public Permission update(Permission permission) {
        permissionDao.update(permission);
        return permission;
    }

    @Override
    public int delete(Integer id) {
        return permissionDao.delete(id);
    }

}