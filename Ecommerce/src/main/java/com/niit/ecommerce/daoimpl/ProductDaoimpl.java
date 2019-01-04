package com.niit.ecommerce.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecommerce.dao.ProductDao;
import com.niit.ecommerce.models.Product;
  
@Transactional
@Repository("productDAO")
public class ProductDaoimpl implements ProductDao
{
	@Autowired
	private SessionFactory sessionFactory;
		public ProductDaoimpl(){
			System.out.println("ProductDaoImpl bean is created..");
		}
		public boolean addProduct(Product product) {
	       Session session= sessionFactory.getCurrentSession();
	       session.save(product);//Generate insert query..
	       return true;
		}
		public Product getProduct(int id) {
			Session session=sessionFactory.getCurrentSession();
			Product product=(Product)session.get(Product.class, id);
			//SQL query select * from product where id=?
			return product;
		}
		

	}


