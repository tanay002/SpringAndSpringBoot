package com.project.secureapp;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{

	@RequestMapping("/")
	public String homePage()
	{
		
		return "index.jsp";
	}
/*	
	//Google OAuh2
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal)
	{
		return principal;
	}
	
	*/
}
