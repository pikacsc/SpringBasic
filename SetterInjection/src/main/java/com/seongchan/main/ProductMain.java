package com.seongchan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seongchan.service.ProductService;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext( new String [] {"ctx.xml"});
		ProductService svc = (ProductService) ctx.getBean("ProductServiceBean");
		System.out.println(svc.toString());
	}
	
}
