package com.springcore.ref;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {
		
		//ApplicationContext factory=new ClassPathXmlApplicationContext("C:\\Users\\Kanika\\eclipse-workspace\\springcore\\src\\main\\java\\com\\springcore\\ref\\aconfig.xml");
		ApplicationContext factory=new FileSystemXmlApplicationContext("C:/Users/Kanika/eclipse-workspace/springcore/src/main/java/com/springcore/ref/aconfig.xml");
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("hconfig.xml"));
		
		A temp=(A)factory.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		System.out.println(temp.getOb());
		System.out.println(temp.toString());
		System.out.println(temp);

	}

}
