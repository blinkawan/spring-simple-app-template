package com.agungsetiawan.springsimple.dao;

import java.util.List;

import com.agungsetiawan.springsimple.domain.User;

public interface UserDao {
	public void save(User user);
	public void edit(User user);
	public void delete(Integer id);
	public User findOne(Integer id);
	public List<User> findAll();
}
