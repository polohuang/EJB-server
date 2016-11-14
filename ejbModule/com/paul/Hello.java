package com.paul;

import java.util.List;

import javax.ejb.Remote;

import com.paul.model.User;

@Remote
public interface Hello {
	public String sayHello(String name);
//	public User addUser(User user);
//	public void removeUser(String tel);
//	public User updateUser(User user);
//	public List<User> listUsers();
//	public User listUser(String tel);
}
