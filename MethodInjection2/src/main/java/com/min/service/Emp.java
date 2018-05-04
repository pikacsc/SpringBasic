package com.min.service;

public abstract class Emp {
	public Emp() {}
	
	
	public void work() {
		getEmp().work();// 주입받은 객체의 getEmp() 메소드를 사용
	}
	
	public abstract Emp getEmp();
}
