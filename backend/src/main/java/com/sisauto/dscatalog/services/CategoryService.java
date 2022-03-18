package com.sisauto.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisauto.dscatalog.entities.Category;
import com.sisauto.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository; 
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
}
