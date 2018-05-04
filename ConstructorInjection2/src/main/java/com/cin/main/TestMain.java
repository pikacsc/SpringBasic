package com.cin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cin.service.Develop;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		Develop dev = (Develop) ctx.getBean("develop");
		dev.coding();
	}
}
