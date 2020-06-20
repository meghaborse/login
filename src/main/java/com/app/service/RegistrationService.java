package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.LoginTest;
import com.app.repository.RegistrationRepository;

@Service
public class RegistrationService 
{
	@Autowired
	private RegistrationRepository repo;
	
	public LoginTest saveUser(LoginTest user)
	{
	   return repo.save(user);
	}
	
	public LoginTest fetchUserByUserName(String username)
	{
		return repo.findByUserName(username);
	}
	
  public LoginTest fetchUserByUserNameAndPassword(String username,String password)
	{
		return repo.findByUserNameAndPassword(username, password);
	}

}
