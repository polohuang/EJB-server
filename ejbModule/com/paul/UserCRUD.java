package com.paul;

import java.util.List;

import javax.ejb.Remote;

import com.paul.model.User;

@Remote
public interface UserCRUD {
	public void addUser(User u);
	public void removeUser(String ID);
	public void updateUser(User u);
	public List<User> findAll();
	public User findOne(String ID);
}
