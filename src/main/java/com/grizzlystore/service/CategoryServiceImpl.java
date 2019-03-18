package com.grizzlystore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.grizzlystore.bean.Category;
import com.grizzlystore.dao.CategoryDAO;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@Override
	@Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryDAO.getAllCategory();
	}

}
