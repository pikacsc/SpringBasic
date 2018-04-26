package com.sin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sin.service.Develop;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		Develop dev = (Develop) ctx.getBean("develope");
		dev.coding();
	}
}
