package org.jsp.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Bike.class, Test.class);
		context.refresh();
		Bike b = context.getBean("bike", Bike.class);
		b.start();
	}
}
