package com.neusoft.tijiancms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijiancms.po.Users;
import com.neusoft.tijiancms.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/getUsersByUserIdByPass")
	public Users getUsersByUserIdByPass(@RequestBody Users users) {
		return usersService.getUsersByUserIdByPass(users);
	}
}
