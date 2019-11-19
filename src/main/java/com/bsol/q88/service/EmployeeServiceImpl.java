package com.bsol.q88.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.EmployeeDao;
import com.bsol.q88.model.Employee;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeDao empdao;
	
	public void saveEmp(Employee emp) {
		
		empdao.save(emp);
	}

}
