package com.project;


import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.User;

@Controller
public class MyController 
{
    @RequestMapping("/")
	public String showFirstPage()
	{
		return "index";
	}
    
    @ModelAttribute
    public void modelData(Model m)
    {
    	m.addAttribute("name", "Tanay Saxena");
    }


   //1 
 /*   @RequestMapping("/add")
    public String addNumber(HttpServletRequest req)
    {
    	int no1=Integer.parseInt(req.getParameter("no1"));
    	int no2=Integer.parseInt(req.getParameter("no2"));
    	int sum=no1+no2;
    //	HttpSession sess=req.getSession();
    	req.setAttribute("result", sum);
    	return "result.jsp";
    }
   */ 
    
    //2
 /*   @RequestMapping("/add")
    public String addNumber(@RequestParam("no1") int no1,@RequestParam("no2") int no2,HttpSession sess)
    {
    	int sum=no1+no2;
    	sess.setAttribute("result", sum);
    	return "result.jsp";
    }
    */
  
    //3-i
  /*  @RequestMapping("/add")
    public ModelAndView addNumber(@RequestParam("no1") int no1,@RequestParam("no2") int no2,ModelAndView mv)
    {
    	mv.setViewName("result");
    	int sum=no1+no2;
    	mv.addObject("result",sum);
    	return mv;
    }
    */
    
    //3-ii
 /*   @RequestMapping("/add")
    public ModelAndView addNumber(@RequestParam("no1") int no1,@RequestParam("no2") int no2)
    {
    	ModelAndView mv=new ModelAndView("result");
    	//mv.setViewName("result");
    	int sum=no1+no2;
    	mv.addObject("result",sum);
    	return mv;
    }
  */  
    //4-i
 /*   @RequestMapping("/add")
    public String addNumber(@RequestParam("no1") int no1,@RequestParam("no2") int no2,Model mv)
    {
    	int sum=no1+no2;
    	mv.addAttribute("result",sum);
    	return "result";
    }
    */
    
    //4-ii
    @RequestMapping("/add")
    public String addNumber(@RequestParam("no1") int no1,@RequestParam("no2") int no2,ModelMap mv)
    {
    	int sum=no1+no2;
    	mv.addAttribute("result",sum);
    	return "result";
    }
    
    @RequestMapping("/addData")
    public String openDataPage()
    {
    	return "register";
    }
    
   // @RequestMapping("/reg")
   // @RequestMapping(value="/reg",method = RequestMethod.POST)
    @PostMapping(value="/reg")
    public String insertData(@ModelAttribute("user") User dto)
    {
    	return "showData";
    }
    
    @GetMapping(value="/getData")
    public String getData(Model mv)
    { 
    	List<User> list=Arrays.asList(new User("Tanay","t@gmail.om",90099L),new User("Raj","raj@gmail.om",99099L));
    	mv.addAttribute("result",list);
    	return "fetchData";
    }
    
    
    
    
}
