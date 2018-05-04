package com.spel;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpellInjectionExam {
	
	private String name;
	private String age;
	
	
	//빈 정의 XML에서 age라는 Property의 value 값을 주입받음
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	

	@Override
	public String toString() {
		return "SpellInjectionExam [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:ctx.xml");
		ctx.refresh();
		
		SpellInjectionExam sample = (SpellInjectionExam) ctx.getBean("sample");
		System.out.println("sample");
		
	}
}
