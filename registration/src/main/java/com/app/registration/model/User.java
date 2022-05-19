package com.app.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String emailId;
	private String userName;
	private int age;
	private String gender;
	private boolean hobby1;
	private boolean hobby2;
	private boolean hobby3;
	private boolean hobby4;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String emailId, String userName, int age, String gender, boolean hobby1, boolean hobby2,
			boolean hobby3, boolean hobby4, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
		this.hobby3 = hobby3;
		this.hobby4 = hobby4;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isHobby1() {
		return hobby1;
	}
	public void setHobby1(boolean hobby1) {
		this.hobby1 = hobby1;
	}
	public boolean isHobby2() {
		return hobby2;
	}
	public void setHobby2(boolean hobby2) {
		this.hobby2 = hobby2;
	}
	public boolean isHobby3() {
		return hobby3;
	}
	public void setHobby3(boolean hobby3) {
		this.hobby3 = hobby3;
	}
	public boolean isHobby4() {
		return hobby4;
	}
	public void setHobby4(boolean hobby4) {
		this.hobby4 = hobby4;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	

}
