package org.jsp.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Car c = context.getBean("myCar", Car.class);
		c.start();
		((ClassPathXmlApplicationContext) context).close();
	}

}
