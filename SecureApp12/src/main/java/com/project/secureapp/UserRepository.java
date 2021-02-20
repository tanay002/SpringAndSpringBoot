package com.project.secureapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails ,Long> {
	UserDetails findByUsername(String username);

}
