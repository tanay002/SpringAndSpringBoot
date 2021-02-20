package com.project.springboot;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.model.Users;

@Controller
public class MyController 
{
	
	
	@Autowired
	public UserRepos repo;
	   
  @GetMapping("users")
  @ResponseBody  //When we use responsebody it will send data as a data not as a jsp name
  //if we want data in json format in postman
    public List<Users> getUsers()
    {
        List <Users> list= repo.findAll();
    	return list;
    }
  
  
  
@GetMapping("user/{uid}")
@ResponseBody
public Users getUser(@PathVariable("uid") int uid)
{
   Users user= repo.findById(uid).orElse(new Users(0, "", ""));
	return user;
}
    
    
}
