package com.grizzlystore.service;

import com.grizzlystore.bean.Login;


public interface LoginService {
	
	public Login authenticateUser(Login login);

	
	//public int getUserStatus(String id);
	public int setUserStatus(Login login);
	public int resetUserStatus(Login login);
	public Login getUserProfile(String id);
	public String getUserType(Login login);
	public boolean authenticate(String userName,String password);
	public String authorization(String userName,String password);
	public int authenticateUserId(Login login);
	int getUserStatus(Login login);
	public int getUserStatus(String userName);
}
