package org.jsp.springAnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMySessionFactory {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MySessionFactory factory = context.getBean(MySessionFactory.class);
		System.out.println("User name: " + factory.getDataSource().getUsername());
		System.out.println("Password: " + factory.getDataSource().getPassword());
		System.out.println("DriverClassName: " + factory.getDataSource().getDriverClassName());
		System.out.println("Url: " + factory.getDataSource().getUrl());
		System.out.println("Mapping Resource: " + factory.getMappingResources());
		System.out.println("Hibernate Properties: " + factory.getHibernateProperties());
		((AnnotationConfigApplicationContext)context).close();
	}
}
