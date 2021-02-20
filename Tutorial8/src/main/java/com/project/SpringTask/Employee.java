package com.project.SpringTask;

public class Employee 
{
	private int age;
	private Computer comp;
	
	public Employee()
	{
		System.out.println("Object created of Employee");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		System.out.println("Age assigned");
		this.age = age;
	}


	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

	public void demo()
	{
		comp.compile();
	}
}
