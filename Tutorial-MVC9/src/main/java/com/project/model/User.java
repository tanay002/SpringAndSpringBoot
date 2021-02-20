package com.project.model;

import org.springframework.stereotype.Component;

public class User
{
private String uname;
private String uemail;
private Long umobno;

public User(String uname,String uemail,Long umbno)
{
	this.uname=uname;
	this.uemail=uemail;
	this.umobno=umobno;
}
public User()
{
	}

public String toString()
{
return uname+" "+uemail+" "+umobno;	
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public Long getUmobno() {
	return umobno;
}
public void setUmobno(Long umobno) {
	this.umobno = umobno;
}



}
