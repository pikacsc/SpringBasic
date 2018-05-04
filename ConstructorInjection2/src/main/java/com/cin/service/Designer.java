package com.cin.service;

import org.springframework.stereotype.Service;

@Service
public class Designer implements Emp{

	@Override
	public void work() {
		System.out.println("디자이너가 일을 합니다.");
	}

	@Override
	public void goHome() {
		System.out.println("디자이너가 퇴근을 합니다.");
			
	}

}
