package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("sample")
public class SpellInjectionExam {
	
	private String name;
	private String age;
	
	@Value("#{onj.name}")
	public void setName(String name) {
		this.name = name;
	}

	@Value("#{onj.age}")
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
		System.out.println(sample);
		
	}
}
