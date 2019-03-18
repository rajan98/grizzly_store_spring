package com.grizzlystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.grizzlystore.bean.Login;
import com.grizzlystore.dao.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;

	@Override

	@Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
	public Login authenticateUser(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.authenticateUser(login);
	}

	@Override
	public int getUserStatus(Login login)
	{
		// TODO Auto-generated method stub
		return loginDAO.getUserStatus(login);
	}

	@Override
	public int setUserStatus(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.setUserStatus(login);
	}

	@Override
	public int resetUserStatus(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.resetUserStatus(login);
	}

	@Override
	public Login getUserProfile(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserType(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.getUserType(login);
	}

	@Override
	public boolean authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String authorization(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int authenticateUserId(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.authenticateUserId(login);
	}

	@Override
	public int getUserStatus(String userName) {
		// TODO Auto-generated method stub
		return loginDAO.getUserStatus(userName);
	}


	
	
}
