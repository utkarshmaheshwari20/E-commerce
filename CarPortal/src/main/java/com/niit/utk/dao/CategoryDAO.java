package com.niit.utk.dao;

import java.util.List;

import com.niit.utk.model.Category;

public interface CategoryDAO {
	
	public List<Category> getAllCategory(); // retrieving all the cars from the
											// database

	public Category insertCategory(Category category); // inserting a new car

	public Category getCategoryById(int id); // fetching a single car

}
