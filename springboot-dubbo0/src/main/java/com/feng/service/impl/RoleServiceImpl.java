package com.feng.service.impl;


import com.feng.bean.Role;
import com.feng.dao.RoleDao;
import com.feng.service.RoleService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@DubboService(protocol = {"dubbo"}, validation = "false")
public class RoleServiceImpl implements RoleService {

    @Autowired
	private RoleDao roleDao;
	@Override
	public List<Role> getByMap(Map<String,Object> map) {
	    return roleDao.getByMap(map);
	}
	@Override
	public Role getById(Integer id) {
		return roleDao.getById(id);
	}

	@Override
	public Role create(Role role) {
		roleDao.create(role);
		return role;
	}

	@Override
	public Role update(Role role) {
		roleDao.update(role);
		return role;
	}
	@Override
	public int delete(Integer id) {
		return roleDao.delete(id);
	}
    
}