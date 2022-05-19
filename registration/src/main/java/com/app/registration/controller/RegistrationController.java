package com.app.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.registration.model.User;

import com.app.registration.services.RegistrationService;

@RestController 
//Response In Form of JASON
//By Default every method in RestController will return response not UI 

public class RegistrationController {
	
	//whenever user will fill the data in registration from and click and submit button 
//this method will be call
	
	
	@Autowired 
	private RegistrationService service;
	
	
	@RequestMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User  registerUser(@RequestBody User user ) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			User userobj=  service.fetchUserByEmailId(tempEmailId);
			if(userobj != null) {
				
				throw new Exception("user with "+tempEmailId+" is already exist");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		User userObj = null;
		
		if(tempEmailId != null && tempPass != null) {
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);		
		}
		
		if(userObj == null) {
			throw new Exception("Bad Credentials");
		}
	
		return userObj;
	}
	
	
	
}
