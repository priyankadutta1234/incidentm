package com.incident.app;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "Registration")
public class registration {

    
   
   private String Name;
   @Column(nullable = false, unique = true)
   private String Email;
    private String Password;

    private String Confirm;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirm() {
		return Confirm;
	}

	public void setConfirm(String confirm) {
		Confirm = confirm;
	} ;
    
    
}

   