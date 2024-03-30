package org.jsp.springpractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBankAccount {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("car.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		BankAccount account = factory.getBean("account", BankAccount.class);
		account.display();
	}
}
