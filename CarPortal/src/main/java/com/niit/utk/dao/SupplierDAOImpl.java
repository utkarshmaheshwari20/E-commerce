package com.niit.utk.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.utk.model.Supplier;
@Repository
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	SessionFactory sessionFactory;

	public List<Supplier> getAllSupplier() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> supplier=query.list();
		return null;
	}

	public Supplier insertSupplier(Supplier supplier) {
		Session session=sessionFactory.openSession();
		session.save(supplier);
		session.flush();
		session.close();
		return null;
	}

	public Supplier getSupplierById(int id) {
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier) session.get(Supplier.class, id);
		session.flush();
		session.close();
		return supplier;
	}
	
}
