package com.agungsetiawan.springsimple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agungsetiawan.springsimple.dao.UserDao;
import com.agungsetiawan.springsimple.domain.User;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	public void save(User user) {
		userDao.save(user);
	}

	public void edit(User user) {
		userDao.edit(user);
	}

	public void delete(Integer id) {
		userDao.delete(id);
	}

	public User findOne(Integer id) {
		return userDao.findOne(id);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}
}
