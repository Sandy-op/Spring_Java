package org.jsp.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPhonepe {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext("org.jsp.springannotationdemo");
		PhonePe pe = context.getBean("phonePe", PhonePe.class);
		pe.open();

	}
}
