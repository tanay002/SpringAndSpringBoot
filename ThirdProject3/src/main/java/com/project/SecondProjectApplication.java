package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecondProjectApplication {

	public static void main(String[] args) {
 ConfigurableApplicationContext con=SpringApplication.run(SecondProjectApplication.class, args);
	 Employee e=con.getBean(Employee.class);
	Address a= e.getAdd();
	 e.show();
	 
	 Employee e1=con.getBean(Employee.class);
		Address a1= e1.getAdd();
		 e1.show();
		 System.out.println(e.hashCode()==e1.hashCode());
		 System.out.println(a.hashCode()==a1.hashCode());
		 
	 
	}

}
