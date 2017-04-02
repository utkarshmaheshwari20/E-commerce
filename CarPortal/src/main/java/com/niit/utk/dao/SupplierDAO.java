package com.niit.utk.dao;

import java.util.List;

import com.niit.utk.model.Supplier;

public interface SupplierDAO {
	public List<Supplier> getAllSupplier();
	public Supplier insertSupplier(Supplier supplier);
	public Supplier getSupplierById(int id);

}
