package com.project.SpringTask;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
       Employee emp=(Employee) factory.getBean("emp");
       emp.demo();
    }
}
