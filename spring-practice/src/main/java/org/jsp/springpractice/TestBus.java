package org.jsp.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBus {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bike-engine.xml");
		Bus bus = context.getBean("myBus", Bus.class);
		bus.getEngine().start();
		
		Bus urBus = context.getBean("urBus", Bus.class);
		urBus.getEngine().start();
	}
}
