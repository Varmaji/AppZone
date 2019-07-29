package com.xworkz.appzone.dto.login;

import org.apache.log4j.Logger;

public class LoginDTO {
	
	private static final Logger logger=Logger.getLogger(LoginDTO.class);

	private String username;
	private String password;
	private String role;

	public LoginDTO() {
		logger.info("invoked loginDTO");
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", password=" + password + "]";
	}

	

}
