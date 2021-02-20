package com.project;

import org.springframework.stereotype.Component;

@Component //If we want to instance of Address the we have use @component
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
