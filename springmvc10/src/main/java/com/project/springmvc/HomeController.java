package com.project.springmvc;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.springmvc.dao.UserDao;
import com.project.springmvc.model.Users;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController
{
	@Autowired
	private UserDao dao;
	
	@ModelAttribute
	public void modelData(Model m) 
	{
	m.addAttribute("name","Aliens");
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("getUser")
	public String getAliens(Model m)
	{
		m.addAttribute("result", dao.getAliens());
		return "showAliens";
		
	}
	
	
	@GetMapping("getUsers")
	public String getAlien(@RequestParam int aid, Model m)
	{
		m.addAttribute("result", dao.getAlien(aid));
		return "showAliens";
		
	}
	
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i ,@RequestParam("num2") int j, Model m)
	{
		
	
		int num3 = i + j;
		
		m.addAttribute("num3",num3);
		
		return  "result";
		
	}
	
	
	@RequestMapping("addUser")
	public String addAlien(@ModelAttribute("result") Users a)
	{
		dao.addAlien(a);
		
		return "showAliens";
		
	}
}
