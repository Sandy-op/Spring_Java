package org.jsp.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyDataSource {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mydatasource.xml");
        MyDataSource myDataSource = context.getBean("myDataSource", MyDataSource.class);
        System.out.println("UserName: " + myDataSource.getUsername());
        System.out.println("Password: " + myDataSource.getPassword());
        System.out.println("DriverClassName: " + myDataSource.getDriverClassName());
        System.out.println("Url: " + myDataSource.getUrl());
        
       System.out.println("-----------------");
       MySessionfactory mySessionFactory=context.getBean("mySessionFactory",MySessionfactory.class);
       System.out.println("Mapping Resources: "+mySessionFactory.getMappingResources());
       System.out.println("Hibernate Properties "+mySessionFactory.getHibernateProperties());
    }
}
