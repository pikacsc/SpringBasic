package com.cin.service;

public class Develop {
	
	
	Emp emp;
	
	
	
	public Develop(Emp emp) {
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
