package com.grizzlystore.dao;

import com.grizzlystore.bean.Login;
public interface LoginDAO {
	
	public Login authenticateUser(Login login);
	public int getUserStatus(Login login);
	public int setUserStatus(Login login);
	public Login getUserProfile(String id);
	public int resetUserStatus(Login login);
	public String getUserType(Login login);
	public boolean authenticate(String userName,String password);
	public int authenticateUserId(Login login);
	public int getUserStatus(String userName);
}
