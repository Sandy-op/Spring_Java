package org.jsp.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class openPaytm {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Paytm paytm = context.getBean("paytm", Paytm.class);
		paytm.open();
		((AnnotationConfigApplicationContext)context).close();
	}
}
