package com.simplilearn.crud;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simplilearn.crud.entity.User;
import com.simplilearn.crud.service.UserService;

@SpringBootTest
class SpringbootRestcrudDemoApplicationTests {

	@Autowired
	private UserService service;
	@Disabled
	@Test
	public void addTest() {
		Assertions.assertNotNull(service.addUser(new User("Alex","alex@gmail.com","UK")));
	}
	@Test
	public void getTest() {
		Assertions.assertEquals(2, service.getAllUsers().size());
	}
	//write test cases for update and delete
	
}
