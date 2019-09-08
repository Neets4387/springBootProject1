package com.nits.project1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nits.project1.entity.User;
import com.nits.project1.service.EmployeeService;

@RestController
public class UserManagmentController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/userdesc")
	public List<User> getAllUsers() {
		
		return employeeService.getAllUsers();
	}
	 @RequestMapping("/userdesc/{id}")
	public User getUser(@PathVariable int id) {
		 return employeeService.getUser(id);
	 }

}
