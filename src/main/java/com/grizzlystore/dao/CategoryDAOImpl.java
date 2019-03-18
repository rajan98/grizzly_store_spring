package com.grizzlystore.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.grizzlystore.bean.Category;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		TypedQuery<Category> query = sessionFactory.getCurrentSession().createQuery("from Category");
		return query.getResultList();
	}

}
