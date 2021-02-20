package com.project.secureapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails
{
	@Id
	private int id;
	private String username;
	private String password;

	public UserDetails(int id,String username,String password)
	{
		this.id=id;
		this.username=username;
		this.password=password;
	}
    
	
	public UserDetails()
	{
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

  
}
