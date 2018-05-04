package com.cin.service;

import org.springframework.stereotype.Service;

@Service
public class Programmer implements Emp {

	@Override
	public void work() {
		System.out.println("프로그래머가 일을 합니다....");
	}

	@Override
	public void goHome() {
		System.out.println("프로그래머가 퇴근을 합니다....");
		
	}

}
