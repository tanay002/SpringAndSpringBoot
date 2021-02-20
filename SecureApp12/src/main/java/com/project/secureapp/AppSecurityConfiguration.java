package com.project.secureapp;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
/* @EnableOAuth2Sso */
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter
{
	/*
	//Google OAuth2
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http 
		      .csrf().disable()
		      .authorizeRequests().antMatchers("/login").permitAll()
		      .anyRequest().authenticated();
	}
	*/
	
	          //Mysql Se data fetch karna hai
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public AuthenticationProvider authProvider()
	{
		
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		//provider.setPasswordEncoder(new BCryptPasswordEncoder()); //Encrypt password based on rounds
		return provider;
	}
	
	
	
	
	/*
	//Custom username and password
	@Bean
	@Override
	protected UserDetailsService userDetailsService() 
	{
		List<UserDetails> users=new ArrayList();
		users.add(User.withDefaultPasswordEncoder().username("Tanay").password("007008").roles("USER").build());
		return new InMemoryUserDetailsManager(users);
	}
	*/
  
}
