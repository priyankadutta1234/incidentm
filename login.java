package com.incident.app;


	
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	
	import javax.persistence.Table;

	@Entity
	@Table(name = "login")
	public class login {
       @Id
	   @GeneratedValue(strategy= GenerationType.IDENTITY)
	   private Long id;
	   private String username;
	   private String password;
	   
	   
	   
	    public login() {
		
	}

		public login(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public long id() {
	        return id;
	    }

	    public void setid(Long id) {
	        this.id = id;
	    }

	     public String username() {
	        return username;
	    }

	    public void setusername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	   

	   
	}


