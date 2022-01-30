package com.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
//import org.springframework.core.io.FileSystemResource;

/**
 *Hello world!
 *
 */

public class App 
{
    //private static ApplicationContext context;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     /* ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
      Student student1=(Student)context.getBean("student1");
    System.out.println(student1);*/
        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("config.xml"));
        Student student1 =(Student)factory.getBean("student1");
        Student st=(Student)factory.getBean("student2");
        System.out.println(student1);
        System.out.println(st);
       /* ApplicationContext context=new FileSystemXmlApplicationContext("config.xml");
        Student student1 =(Student)context.getBean("student1");
        Student st =(Student)context.getBean("student2");
        Student st3 =(Student)context.getBean("student3");
        System.out.println(student1);
        System.out.println(st);
        System.out.println(st3);*/
        //System.out.println(student1.getPhones());
}
}
