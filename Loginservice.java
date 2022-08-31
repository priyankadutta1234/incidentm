package com.incident.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Loginservice {
	
	@Autowired
	
	private Loginrepository repo;
	
	public login login(String Username, String Password) {
		login user =repo.findByUsernameAndPassword(Username,Password);
		return login(null, null);
	}

}
