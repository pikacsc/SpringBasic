package com.min.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
			Emp emp = (Emp) ctx.getBean("emp");
			emp.work();
		}
}
