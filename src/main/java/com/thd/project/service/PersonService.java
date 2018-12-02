package com.thd.project.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.thd.project.entity.Person;

public interface PersonService {
	public List queryAllPerson();
	
	@Transactional
	public void savePerson(Person p);
	
	
	
}
