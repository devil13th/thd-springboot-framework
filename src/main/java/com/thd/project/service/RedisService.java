package com.thd.project.service;

import com.thd.project.entity.Person;

public interface RedisService {
	public Person add(Person p );
	public boolean delete(String id);
	public Person update(Person p);
	public Person query(String id);
	
	
	public String add(Integer i);
	public String multi(Integer i);
}
