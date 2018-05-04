package com.myapp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.dto.MemberDTO;
import com.myapp.service.MemberService;

public class MemberMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		MemberService svc = (MemberService) ctx.getBean("memberService");
		System.out.println(svc.toString());
	}
}
