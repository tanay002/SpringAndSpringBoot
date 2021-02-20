package com.project.SpringTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
       Employee emp=(Employee) factory.getBean("emp");
       emp.age=20;
       emp.demo();
       System.out.println(emp.age);
       //Spring create only one object.Both the reference emp1 and emp2 refers to the same object
       //Bydefault spring follow singleton scope so it create single object per bean.
       
       //For Multiple object we use scope="prototype"
       
       Employee emp1=(Employee) factory.getBean("emp");
       emp1.demo();
       System.out.println(emp1.age);
    }
}
