package com.project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Users;

public interface UserRepos extends JpaRepository<Users,Integer>
{
	List<Users> findByUnameOrderByUidDesc(String uname);
}
