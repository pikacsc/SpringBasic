package com.ojc.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(value=1)
public class Programmer implements Emp {

	@Override
	public void work() {
		System.out.println("프로그래머가 일을 합니다");
	}

}
