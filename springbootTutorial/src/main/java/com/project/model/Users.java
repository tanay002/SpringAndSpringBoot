package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Users
{
	@Id
	private int uid;
	private String uname;
	private String ucity;

	public Users(int uid,String uname,String ucity)
	{
		this.uid=uid;
		this.uname=uname;
		this.ucity=ucity;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Users()
	{
	}

	public String toString()
	{
		return uname+" "+uid+" "+ucity;	
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUcity() {
		return ucity;
	}

	public void setUcity(String ucity) {
		this.ucity = ucity;
	}



}
