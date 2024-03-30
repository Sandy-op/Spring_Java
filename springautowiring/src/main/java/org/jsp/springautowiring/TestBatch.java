package org.jsp.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBatch {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("batch.xml");
	Batch batch=context.getBean("batch",Batch.class);
	System.out.println("Names:"+batch.getNames());
	System.out.println("Phone Number: "+batch.getPhone_no());
	System.out.println("Details "+batch.getDetails());
}
}