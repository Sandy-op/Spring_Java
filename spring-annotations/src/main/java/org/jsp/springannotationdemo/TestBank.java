package org.jsp.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBank {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		BankAccount account = context.getBean("bankAccount",BankAccount.class);
		System.out.println(account);
	}
}
