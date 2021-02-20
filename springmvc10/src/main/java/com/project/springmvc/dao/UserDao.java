package com.project.springmvc.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.project.springmvc.model.Users;


@Component
public class UserDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
public List<Users> getAliens()
{
	Session session = sessionFactory.getCurrentSession();
	List <Users> aliens = session.createQuery("from Alien",Users.class).list();
	
	return aliens;
}
	@Transactional
	public void addAlien(Users a)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(a);
	}
	
	
	@Transactional
	public Users getAlien(int aid) 
	{
		Session session = sessionFactory.getCurrentSession();
		Users a= session.get(Users.class, aid);
		return a;
	}
}
