package com.niit.ecommerce;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce.dao.CategoryDao;
import com.niit.ecommerce.models.Category;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class CategoryDaoTesting {

	static CategoryDao categoryDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		categoryDAO=(CategoryDao)context.getBean("categoryDAO");
	}
	
	@Ignore
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
		category.setCategoryname("WindowCurtain");
		category.setCategory_id(45);
		
		assertTrue("Probem in Adding the Category",categoryDAO.add(category));
	}


}
