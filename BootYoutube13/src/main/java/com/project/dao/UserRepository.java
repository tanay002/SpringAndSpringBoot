package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.model.Users;

public interface UserRepository extends CrudRepository<Users,Integer>
{
	List<Users> findByUcity(String ucity);
//	System.out.println(repo.findByUcity("indore"));
	
	@Query("from Users where ucity=?1 order by uname")
	List<Users> findByUcitySorted(String ucity);
	//System.out.println(repo.findByUcitySorted("Indore"));
	
	List<Users> findByUidGreaterThan(int uid);
	//	List<Users> user=repo.findByUidGreaterThan(0);
}
