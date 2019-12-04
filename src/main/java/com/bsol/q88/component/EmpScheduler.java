package com.bsol.q88.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.model.Employee;
import com.bsol.q88.service.EmployeeServiceImpl;

//@Component
//@EnableScheduling
public class EmpScheduler {
	
@Autowired
private EmployeeServiceImpl empservice;


	
	
	@Scheduled(cron = "0 */1 * ? * *")
	public void empsaveOperation() {
	
		Employee emp = new Employee();
		emp.setName("punith");
		empservice.saveEmp(emp);
		
		System.out.println("Save emp is finished");
		
		
	}

}
