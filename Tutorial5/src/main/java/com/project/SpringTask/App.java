package com.project.SpringTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
       Employee emp=(Employee) factory.getBean("emp");
       emp.demo();
       System.out.println(emp.getAge());
    }
}
