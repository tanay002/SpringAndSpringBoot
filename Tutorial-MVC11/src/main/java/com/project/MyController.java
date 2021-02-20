package com.project;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Users;
//@RestController If we use RestController we dont need to write @responsebody with eah method
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
		//int i=10/0;
		System.out.println("fetching users");
		return list;
	}



	@GetMapping("user/{uid}")
	@ResponseBody
	public Users getUser(@PathVariable("uid") int uid)
	{
		Users user= repo.findById(uid).orElse(new Users(0, "", ""));
		return user;
	} 

	@PostMapping("user")
	@ResponseBody
	public Users setUser(Users user)
	{
		repo.save(user);
		return user;
	} 

	@GetMapping("umax/{uname}")
	@ResponseBody
	public List <Users> getDescId(@PathVariable("uname") String uname)
	{
		List <Users> users= repo.findByUnameOrderByUidDesc(uname);
		return users;
	} 

	@GetMapping(path = "usersList",produces = {"application/xml"}) 
	//only accept xml..This is the only thing i want to written
	//When we fetch we get data in xml format
	//But what happen if try to get data in json format now..
	//It will give same error which we get when we are fetching data in xml format
	//Not acceptable 406 code
	@ResponseBody   //Restrict particular format i.e json or xml 
	public List<Users> getUsersFData()
	{
		List <Users> list= repo.findAll();
		return list;
	}

	@PostMapping("addData")
	@ResponseBody
	public Users setUserData(@RequestBody Users user)
	{
		repo.save(user);
		return user;
	} 

	
	@PostMapping(path="addMyData",consumes = {"application/json"})
	@ResponseBody
	public Users setUserDataRestrict(@RequestBody Users user)
	{
		repo.save(user);
		return user;
	} 
}
