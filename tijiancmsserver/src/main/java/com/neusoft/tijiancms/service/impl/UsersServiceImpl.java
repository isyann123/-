package com.neusoft.tijiancms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijiancms.mapper.UsersMapper;
import com.neusoft.tijiancms.po.Users;
import com.neusoft.tijiancms.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users getUsersByUserIdByPass(Users users) {
		return usersMapper.getUsersByUserIdByPass(users);
	}
}
