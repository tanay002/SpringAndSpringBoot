package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecondProjectApplication {

	public static void main(String[] args) {
 ConfigurableApplicationContext con=SpringApplication.run(SecondProjectApplication.class, args);
	 Employee e=con.getBean(Employee.class);
	 e.show();
	
	 Employee e1=con.getBean(Employee.class); //It will create only one object..but when we use scope="prototype"
	      //in our class then it will create 2 objects
	 e1.show();
	}

}
