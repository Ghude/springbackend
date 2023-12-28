package com.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entity.UserData;
import com.backend.service.UserDataService;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserDataService userdataservice;
	
	public UserController(UserDataService userdataservice) {
		this.userdataservice = userdataservice;
	}
	
	@PostMapping("/addUsers")
	public void addUser(@RequestBody UserData user) {
		System.out.println(user);
		userdataservice.addUser(user);
	}
	
	
}
