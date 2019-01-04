package com.niit.ecommerce;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce.dao.ProductDao;
import com.niit.ecommerce.models.Product;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class ProductDAOTesting {
	
	static ProductDao productDAO;

	@BeforeClass
	public static void execute() {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		productDAO=(ProductDao)context.getBean("productDAO");
	}
	
	@Ignore
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProduct_id(46);
		product.setProductname("WindowCurtain");
		product.setDiscription("black and white");
		product.setQuantity(5);
		
		assertTrue("Probem in Adding the Category",productDAO.addProduct(product));
	}
	
//	@Ignore
//	@Test
//	public void updateProductTest()
//	{	
//		Product product=productDAO.getProduct(5);
//		product.setDiscription("Wash Basin");	
//		assertTrue("Problem in Updating ",productDAO.update(product));
//	}
//	@Ignore
//	@Test
//	public void deleteProductTest()
//	{
//		Product product=productDAO.getProduct(5);
//		assertTrue("Problem in Updating ",productDAO.delete(product));
//	}
//	
//	@Test
//	public void listProductsTest()
//	{
//		List<Product> listProducts=productDAO.listProducts();
//		
//		assertTrue("Problem in Listing",listProducts.size()>0);
//		
//		for(Product product:listProducts)
//		{
//			System.out.print("Product ID:"+product.getProductId());
//			System.out.print("Product Name:"+product.getProductName());
//			System.out.println("Product Desc:"+product.getproductDesc());
//		}
//	}
	
}




	


