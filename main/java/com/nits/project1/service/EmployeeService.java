package com.nits.project1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nits.project1.entity.User;

@Service
public class EmployeeService {
	
	private List<User> users = Arrays.asList(
			new User(101,"rakesh","rakesh.singh@"),
			new User(102,"nitesh","nitesh.singh@"),
			new User(103,"ritesh","ritesh.singh@")
			);
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUser(int id) {
		return users.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
}
