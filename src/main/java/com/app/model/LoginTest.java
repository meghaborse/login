package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginTest
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY	)
	 private int id;
	 private String userName;
	 private String password;
	
	 
	 public LoginTest()
	 {
		 
	 }
	 
	public LoginTest(int id, String password, String userName) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	 
	 
	 

}
