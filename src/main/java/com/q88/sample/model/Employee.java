package com.q88.sample.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_id;
	private String user_name;
	private String user_tech;
	
	
	
	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_tech() {
		return user_tech;
	}


	public void setUser_tech(String user_tech) {
		this.user_tech = user_tech;
	}
	
	

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}


	
	   @Override
	public String toString() {
		return "Employee [user_id=" + user_id + ", user_name=" + user_name + ", user_tech=" + user_tech + "]";
	}

       public boolean equals(Object o) {
           if (this == o) {
               return true;
           }
           if (o == null || getClass() != o.getClass()) {
               return false;
           }
           Employee emp = (Employee) o;
           return user_id == emp.user_id &&
                   user_name.equals(emp.user_name) &&
                   user_tech.equals(emp.user_tech);
       }
	 
	

	
	
	

}
