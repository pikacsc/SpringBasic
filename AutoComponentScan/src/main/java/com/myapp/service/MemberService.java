package com.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dto.MemberDTO;

@Service
public class MemberService {
	
	@Autowired
	MemberDTO dto;
	
	@Override
	public String toString() {
		return dto.toString();
	}
	
}
