package com.myapp.dto;

import org.springframework.stereotype.Component;

@Component
public class MemberDTO {
	private String name;
	private String id;
	private String pwd;
	private String email;
	
	
	public MemberDTO() {
		defaultSetting();
	}
	
	
	public void defaultSetting() {
		this.name = "최성찬";
		this.id = "csc";
		this.pwd = "1234";
		this.email = "csc1234@gmail.com";
	}


	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", id=" + id + ", pwd=" + pwd + ", email=" + email + "]";
	}
	
	
}
