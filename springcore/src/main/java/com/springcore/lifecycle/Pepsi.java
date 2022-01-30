package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean  {
	private int price;
	private String type;
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public Pepsi(int price, String type) {
		super();
		this.price = price;
		this.type = type;
	}

//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	@Override
	public String toString() {
		return "Pepsi [price=" + this.price + ", type=" + this.type + "]";
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello I am inside afterPropertiesSet method");
		// TODO Auto-generated method stub
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy interface");
		
	}
	
	
	
	

}
