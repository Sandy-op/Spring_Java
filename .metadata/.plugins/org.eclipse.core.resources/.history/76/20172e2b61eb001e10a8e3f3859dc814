	package org.jsp.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bike-engine.xml");
		Bike myBike = context.getBean("myBike", Bike.class);
		System.out.println("Brand: "+myBike.getBrand());
		myBike.getEngine().start();
		System.out.println("===========================================");
		
		Bike yourBike = context.getBean("yourBike", Bike.class);
		System.out.println("Brand: "+yourBike.getBrand());
		yourBike.getEngine().start();
	}
}