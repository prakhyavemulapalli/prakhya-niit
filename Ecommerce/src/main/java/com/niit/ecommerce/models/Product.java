package com.niit.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int product_id;
String productname;
int quantity;
String discription;
int price;
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getQuatity() {
	return quantity;
}
public void setQuantity(int quatity) {
	this.quantity = quatity;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}




}
