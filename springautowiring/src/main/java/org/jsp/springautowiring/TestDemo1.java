package org.jsp.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo1 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("demo1.xml");
	System.out.println("---------------");
	System.out.println(context.getBean("demo1"));
	System.out.println(context.getBean("demo1"));
	System.out.println(context.getBean("demo1"));
	System.out.println(context.getBean("demo1"));
	((ClassPathXmlApplicationContext)context).close();
}
}
