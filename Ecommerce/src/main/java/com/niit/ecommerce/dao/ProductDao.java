package com.niit.ecommerce.dao;

import org.springframework.stereotype.Repository;

import com.niit.ecommerce.models.Product;
@Repository("productDAO")
public interface ProductDao {
	boolean addProduct(Product product);
	Product getProduct(int id);

}
