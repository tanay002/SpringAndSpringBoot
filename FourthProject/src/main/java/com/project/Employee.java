package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	private int eid;
	private String sname;
	private String city;
	
	@Autowired
	@Qualifier("add1")
    private Address address;
    
	public  Employee()
	{
		System.out.println("This is constructor");	
	}

	public Address getAdd() {
		return address;
	}

	public void setAdd(Address address) {
		this.address = address;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	void show()
	{
		System.out.println("This show method");	
		address.compile();
	}
}
