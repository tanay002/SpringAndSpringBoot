package com.project;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.UserRepository;
import com.project.dao.UserRepository2;
import com.project.model.Users;

@Controller
public class HomeController 
{
	@Autowired
	UserRepository repo;
	
	@Autowired
	UserRepository2 repo2;
	 
	@RequestMapping("/")
	public String homePage()
	{

		return "index.jsp";
	}

/*	
	@RequestMapping("/adduser")
	public String addUser(Users users)
	{
		repo.save(users);
		return "index.jsp";
	}
	*/
	
	@PostMapping("/adduser")
	@ResponseBody
	public String addUser(Users users)
	{
		repo.save(users);
		return "User Added Successfully";
	}

/*	@RequestMapping("/getuser")
	public ModelAndView getUser(@RequestParam int uid,ModelAndView mv)
	{
		//System.out.println(uid);
		mv=new ModelAndView("showUsers.jsp");
		Users user=repo.findById(uid).orElse(new Users(0, null, null));
		mv.addObject("user", user);
		return mv;
	}
*/
	@GetMapping("/getuser/{uid}")
	@ResponseBody
	public Optional<Users> getUser(@PathVariable int uid)
	{
		return repo.findById(uid);
	}
	
	@DeleteMapping("/user/{uid}")
	@ResponseBody
	public String deleteUser(@PathVariable int uid)
	{
		Users user=repo2.getOne(uid);
		repo2.delete(user);
		return "deleted";
		
	}
	
	
	@PutMapping(path = "/user",consumes = {"application/json"})
	@ResponseBody
	public Users saveOrUpdateUser(@RequestBody Users users)
	{
		repo2.save(users);
		return users;
		
	}
	
	
	
/*	@RequestMapping("/getuser")
	@ResponseBody
	public Optional<Users> get1User(@RequestParam int uid)
	{
		//System.out.println(uid);
		return repo.findById(uid);
		
	}
	*/
	
	@RequestMapping("/fetch")
	@ResponseBody
	public List<Users> fetchUsers()
	{	
		//return repo.findAll().toString();  //CrudRepo
		return repo2.findAll();
	}

}
