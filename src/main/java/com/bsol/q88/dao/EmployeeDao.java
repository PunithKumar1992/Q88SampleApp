package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bsol.q88.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
