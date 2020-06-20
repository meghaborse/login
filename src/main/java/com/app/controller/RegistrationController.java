package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.LoginTest;
import com.app.service.RegistrationService;

@RestController
public class RegistrationController
{    
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public LoginTest registerUser(@RequestBody LoginTest user) throws Exception
	{
		
		//emailid already present o not	
		String tempName=user.getUserName();
		if(tempName != null && !"".equals(tempName))
		{
			LoginTest userObj=service.fetchUserByUserName(tempName);
			if(userObj != null)
			{
				throw new Exception("user with " +tempName+ " is already exist");
			}
			
		}
		LoginTest userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}
     @PostMapping("/login")
     @CrossOrigin(origins = "http://localhost:4200")
	public LoginTest loginUser(@RequestBody LoginTest user) throws Exception
	{
		String tempName=user.getUserName();
		String tempPass=user.getPassword();
		LoginTest userObj=null;
		if(tempName != null && tempPass != null)
		{
			userObj=service.fetchUserByUserNameAndPassword(tempName, tempPass);
		}
		if(userObj == null)
		{
			throw new Exception("bad credintials");
		}
				
		return userObj;
	}

}
