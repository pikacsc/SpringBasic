package com.ojc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class EmpMain {

	@Autowired
	List<Emp> emps;
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		EmpMain empMain = (EmpMain) ctx.getBean("empMain");
		for(Emp e: empMain.emps) {
			e.work();
		}
	}

}
