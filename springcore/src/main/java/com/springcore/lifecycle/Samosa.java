package com.springcore.lifecycle;

public class Samosa {
	private int price;
	private String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Samosa [price=" + price + ", name=" + name + "]";
	}
	
	public void hey() {
		System.out.println("inside init method hey");
	}
	public void bye() {
		System.out.println("i am destroying bye->insie Destroy method");
	}

}
