package com.q88.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q88.sample.dao.UserDao;
import com.q88.sample.model.Employee;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userdao;

	@Override
	public List<Employee> getAllUsers() {
		return userdao.findAll();
	}

}
