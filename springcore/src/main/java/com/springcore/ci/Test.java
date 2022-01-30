package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;




public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new FileSystemXmlApplicationContext("C:\\Users\\Kanika\\eclipse-workspace\\springcore\\src\\main\\java\\com\\springcore\\ci\\ciconfig.xml");
	        Person p=(Person)con.getBean("p1");
	    	//A temp=(A)factory.getBean("aref");
	        System.out.println(p);
	     
	}

}
