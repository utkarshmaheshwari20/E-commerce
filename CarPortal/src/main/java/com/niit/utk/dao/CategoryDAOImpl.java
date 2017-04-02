package com.niit.utk.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.utk.model.Car;
import com.niit.utk.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	public List<Category> getAllCategory() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Category");
		List<Category> category=query.list();
		return category;
	}

	public Category insertCategory(Category category) {
		Session session = sessionFactory.openSession();
		session.save(category);
		session.flush();
		session.close();
		return category;
	}

	public Category getCategoryById(int id) {
		Session session = sessionFactory.openSession();
		Category category = (Category) session.get(Category.class, id);
		session.flush();
		session.close();
		return category;
	}

}
