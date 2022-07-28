package com.feng.service;



import com.feng.bean.Role;
import com.feng.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RoleService {
    @Resource
	private RoleDao roleDao;
	
	public List<Role> getByMap(Map<String,Object> map) {
	    return roleDao.getByMap(map);
	}
	
	public Role getById(Integer id) {
		return roleDao.getById(id);
	}
	
	public Role create(Role role) {
		roleDao.create(role);
		return role;
	}
	
	public Role update(Role role) {
		roleDao.update(role);
		return role;
	}
	
	public int delete(Integer id) {
		return roleDao.delete(id);
	}
    
}