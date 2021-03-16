package com.etalents.user.DTO;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class UserDTO {
	
	private String firstName;

	private String surName;

	private String nick;

	private String email;

	private String phone;

	private String password;

	private LocalDateTime createOn;

	private LocalDateTime lastLogin;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreateOn() {
		return createOn;
	}

	public void setCreateOn(LocalDateTime createOn) {
		this.createOn = createOn;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public UserDTO(String firstName, String surName, String nick, String email, String phone, String password,
			LocalDateTime createOn, LocalDateTime lastLogin) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.nick = nick;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.createOn = createOn;
		this.lastLogin = lastLogin;
	}

	
	
	
	
	
	
}

	