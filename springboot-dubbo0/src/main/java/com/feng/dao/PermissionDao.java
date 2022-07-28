package com.feng.dao;


import com.feng.bean.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface PermissionDao {

    List<Permission> getByMap(Map<String, Object> map);

    Permission getById(Integer id);

    Integer create(Permission permission);

    int update(Permission permission);

    int delete(Integer id);

    List<Permission> getList();

    List<Permission> getByUserId(Integer userId);

}