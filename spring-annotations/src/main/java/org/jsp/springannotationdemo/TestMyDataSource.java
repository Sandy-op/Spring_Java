package org.jsp.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMyDataSource {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MyDataSource data = context.getBean("myDataSource", MyDataSource.class);
		System.out.println(data);
		((AnnotationConfigApplicationContext) context).close();
	}
}
