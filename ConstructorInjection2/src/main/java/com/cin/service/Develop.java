package com.cin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Develop {
	
	
	Emp emp;
	
	@Autowired
	public Develop(@Qualifier(value="designer")Emp emp) {
		this.emp = emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public void coding() {
		emp.work();
		System.out.println("개발합니다.");
		emp.goHome();
	}
	
}
