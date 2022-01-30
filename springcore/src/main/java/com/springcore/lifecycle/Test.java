package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test    {
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Kanika\\eclipse-workspace\\springcore\\src\\main\\java\\com\\springcore\\lifecycle\\lifeconfig.xml");
		
		context.registerShutdownHook();
		Samosa sam=(Samosa)context.getBean("s1");
	     System.out.println(sam);
	     Pepsi pepsi=(Pepsi)context.getBean("p1");
	     System.out.println(pepsi);
	     Example exam=(Example)context.getBean("e1");
	     System.out.println(exam);
	     System.out.println(exam.getClass());
	}

}
