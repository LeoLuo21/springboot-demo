package com.feng.dao;



import com.feng.bean.Event;

import java.util.List;
import java.util.Map;

public interface EventDao {

	List<Event> getByMap(Map<String, Object> map);
	Event getById(Integer id);
	Integer create(Event event);
	int update(Event event);
	int delete(Integer id);
}