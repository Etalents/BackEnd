package com.etalents.user.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PLAYERS_PROFILE")
@Entity(name = "PLAYERS_PROFILE")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name= "ID_USER")
	private long id;
	
	@Column(name= "FIRST_NAME")
	private String firstName;
	
	@Column(name= "SURNAME")
	private String surName;
	
	@Column(name= "NICKNAME")
	private String nick;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "PHONE")
	private String phone;
	
	@Column(name= "USER_PASSWORD")
	private String password;
	
	@Column(name= "CREATE_ON")
	private LocalDateTime createOn;
	
	@Column(name= "LAST_LOGIN")
	private LocalDateTime lastLogin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public UserEntity(long id, String firstName, String surName, String nick, String email, String phone,
			String password, LocalDateTime createOn, LocalDateTime lastLogin) {
		super();
		this.id = id;
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
