package com.sin.service;

public class Develop {
	
	
	Emp emp;


	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public void coding() {
		emp.work();
		System.out.println("개발합니다.");
		emp.goHome();
	}
	
}
