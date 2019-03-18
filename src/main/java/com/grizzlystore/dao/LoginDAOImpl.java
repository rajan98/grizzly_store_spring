package com.grizzlystore.dao;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.event.TransactionPhase;

import com.grizzlystore.bean.Login;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	
	public Login authenticateUser(Login login) {
		// TODO Auto-generated method stub
		try{
			
		String userName = login.getUserName();
		String password = login.getPassword();
		Session session = sessionFactory.getCurrentSession();
		String query = "from Login where userName = ? and password = ? ";
		Query<Login> query2 = null;
		
		query2=session.createQuery(query);
		
		query2.setParameter(0,userName);  
		query2.setParameter(1,password);  
		Login user= query2.getSingleResult();
		
		if(user!=null)
		{
		return user;
		}
		else
		{
			return null;
			}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			return null;
		}
	
	}
	

	@Override
	public int getUserStatus(Login login) 
	{
		try{
			
			String userName = login.getUserName();
			String password = login.getPassword();
			Session session = sessionFactory.getCurrentSession();
			String query = "from Login where userName = ? and password = ? ";
			Query<Login> query2 = null;
			
			query2=session.createQuery(query);
			
			query2.setParameter(0,userName);  
			query2.setParameter(1,password);  
			Login user= query2.getSingleResult();
			
			return user.getUserStatus();
		}
			catch(Exception e)
			{
				return -1;
			}
			
	}

	public String getUserType(Login login) 
	{
		try
		{
		String userName = login.getUserName();
		String password = login.getPassword();
		Session session = sessionFactory.getCurrentSession();
		String query = "from Login where userName = ? and password = ? ";
		Query<Login> query2 = null;
		query2=session.createQuery(query);
		
		query2.setParameter(0,userName);  
		query2.setParameter(1,password);  
		Login user= query2.getSingleResult();
		
		return user.getUserType();
	}
		catch(Exception e)
		{
			return null;
		}
		
	     
	}
	
	public boolean authenticate(String userName,String password)
	{
	    
	          return false;
	}
	
	
	@Override
	public int setUserStatus(Login login)
	{
		try
		{
			int currentStatus = getUserStatus(login.getUserName());
			currentStatus = currentStatus+1;
			String userName = login.getUserName();
			Session session = sessionFactory.getCurrentSession();
			String query = "update Login set userStatus = ? where userName = ?";
			Query query2 = session.createQuery(query);  
			query2.setParameter(0,currentStatus); 
			query2.setParameter(1,userName);
			int result = query2.executeUpdate();
			
			return 1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		
	}
	
	
	@Override
	public int authenticateUserId(Login login)
	{
		try{
				String userName = login.getUserName();
				
				Session session = sessionFactory.getCurrentSession();
				String query = "from Login where userName = ?";
				Query<Login> query2 = null;
				
				query2=session.createQuery(query);
				
				query2.setParameter(0,userName);  
			
				Login user= query2.getSingleResult();
				
				if(user!=null)
				{
				return 1;
				}
				else
				{
					return 0;
					}
				}
				catch(Exception e)
				{
					//e.printStackTrace();
					return 0;
				}
			
	       
	}
	
	
	@Override
	public int resetUserStatus(Login login){
	try
	{
		String userName = login.getUserName();
		
		Session session = sessionFactory.getCurrentSession();
		String query = "update Login set userStatus=0 where userName = ?";
		Query query2 = session.createQuery(query);  
		query2.setParameter(0,userName); 
		int result = query2.executeUpdate();
		return 1;
	}
	catch(Exception e)
	{
	return 0;
	}
	}
	
	@Override
	public Login getUserProfile(String id)
	{
	    	  return null;
	          }
	
	
	@Override     
	public int getUserStatus(String userName)
	{
	try{
			
			Session session = sessionFactory.getCurrentSession();
			String query = "from Login where userName = ?";
			Query<Login> query2 = null;
			
			query2=session.createQuery(query);
			
			query2.setParameter(0,userName);  
			 
			Login user= query2.getSingleResult();
			
			return user.getUserStatus();
		}
			catch(Exception e)
			{
				return -1;
			}
	}


}
