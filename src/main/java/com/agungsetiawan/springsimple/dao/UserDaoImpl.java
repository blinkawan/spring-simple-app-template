package com.agungsetiawan.springsimple.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.agungsetiawan.springsimple.domain.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public void edit(User user) {
		sessionFactory.getCurrentSession().merge(user);
	}

	public void delete(Integer id) {
		User user=findOne(id);
		sessionFactory.getCurrentSession().delete(user);
	}

	public User findOne(Integer id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	public List<User> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from User u").list();
	}
}
