package com.project;

import org.springframework.stereotype.Component;

@Component("add1") //object which spring create will not be address it will be add1
public class Address 
{
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void compile()
	{
		System.out.println("Compile This");	
	}
}
