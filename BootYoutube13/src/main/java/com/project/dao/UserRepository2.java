package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.model.Users;

public interface UserRepository2 extends JpaRepository<Users, Integer> {
	/*
	@Query("from Users where uid>=0")
	public List<Users> findByUid();
	*/

}
