package com.colinject;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionExam {
	
	private HashMap<String, Object> map;
	private Properties props;
	private Set set;
	
	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public void display() {
		for(Map.Entry<String, Object> entry:map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "-" + entry.getValue());
		}
		for(Map.Entry<Object, Object> entry:props.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "-" + entry.getValue());
		}
		for(Object obj : set) {
			System.out.println("value : "+ obj);
		}
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:ctx.xml");
		ctx.refresh();
		CollectionExam col = (CollectionExam)ctx.getBean("sample");
		col.display();
	}
}
