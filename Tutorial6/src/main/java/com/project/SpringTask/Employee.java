package com.project.SpringTask;

public class Employee 
{
	private int age;
	private Laptop lap;
	
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

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		System.out.println("Set Laptop referene");
		this.lap = lap;
	}

	public void demo()
	{
		System.out.println("Is Working");
	}
}
