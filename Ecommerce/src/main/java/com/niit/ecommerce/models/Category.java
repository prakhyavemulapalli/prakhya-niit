package com.niit.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Category {
	@Id
	int category_id;
	String categoryname;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	

}
