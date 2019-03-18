package com.grizzlystore.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.grizzlystore.bean.Inventory;
import com.grizzlystore.bean.Product;

import org.hibernate.Session;
import javax.persistence.TypedQuery;
import org.hibernate.query.Query;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(product);
		return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "failed";
		}
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		TypedQuery<Product> query = sessionFactory.getCurrentSession().createQuery("from Product");
		 
	      return query.getResultList();
	}

	public Product findProduct(String id) {
		try{
			Session session = sessionFactory.getCurrentSession();
			String query = "from Product where productId = ?";
			Query<Product> query2 = null;
			query2=session.createQuery(query);
			query2.setParameter(0,id);  
			Product product= query2.getSingleResult();
			if(product!=null)
			{
			return product;
			}
			else
			{
				return null;
				
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return null;
			}
	}

	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		try{
	Product product = sessionFactory.getCurrentSession().load(Product.class, productId);
	sessionFactory.getCurrentSession().delete(product);
				return "success";
				
		}
		catch(Exception e)
		{
			return "failed";
		}
	}

	public List<Product> filterProducts(String query) {
		// TODO Auto-generated method stub
		TypedQuery<Product> query1 = sessionFactory.getCurrentSession().createQuery(query);
		 
	      return query1.getResultList();
	}
	
	@Override
	public List<Inventory> getInventory()
	{
		TypedQuery<Inventory> query = sessionFactory.getCurrentSession().createQuery("from Inventory");
		 
	      return query.getResultList();
	}

}
