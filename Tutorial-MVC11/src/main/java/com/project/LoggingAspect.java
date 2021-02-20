package com.project;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	private static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.project.MyController.getUsers())")
	public void logBefore()
	{
		LOGGER.info("getUsers methods called from aspect");
	}
	

	//@After("execution(public * com.project.MyController.getUsers())")
	@AfterReturning("execution(public * com.project.MyController.getUsers())")
	public void logAfter()
	{
		LOGGER.info("getUsers method executed");
	}
	
	
	@AfterThrowing("execution(public * com.project.MyController.getUsers())")
	public void logException()
	{
		LOGGER.info("Issue");
	}
}
