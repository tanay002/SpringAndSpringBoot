package com.project.SpringTask;

public class Employee 
{
	int age;

	public Employee()
	{
		System.out.println("Object is created");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
	}
	public void demo()
	{
		System.out.println("Is Working");
	}
}
