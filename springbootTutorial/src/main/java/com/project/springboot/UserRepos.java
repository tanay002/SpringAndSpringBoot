package com.project.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Users;

public interface UserRepos extends JpaRepository<Users,Integer>
{
}
