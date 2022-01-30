package com.springcore.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {
	public static void main(String[] args) {
		
		/*ApplicationContext context=new FileSystemXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp em=(Emp)context.getBean("emp1");
		System.out.println(em.getName());
		System.out.println(em.getCourses());
	*/
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/springcore/collections/collectionconfig.xml"));
		//ApplicationContext factory=new FileSystemXmlApplicationContext("qconfig.xml");
		Emp rest =(Emp)factory.getBean("emp1");
		System.out.println(rest.getName());
	}

}
