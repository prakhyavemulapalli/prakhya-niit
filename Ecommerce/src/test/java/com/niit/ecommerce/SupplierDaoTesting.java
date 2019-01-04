package com.niit.ecommerce;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce.dao.CategoryDao;
import com.niit.ecommerce.models.Category;
import com.niit.ecommerce.models.Supplier;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class SupplierDaoTesting {
	static SupplierDao supplierDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		supplierDAO=(SupplierDao)context.getBean("supplierDAO");
	}
	
	@Ignore
	@Test
	public void addSupplierTest()
	{
	    Supplier supplier=new Supplier();
		supplier.setSuppliername("WindowCurtain");
		supplier.setSupplier_id(45);
		
		assertTrue("Probem in Adding ",supplierDAO.add(supplier));
	}

	
	
	
	

}
