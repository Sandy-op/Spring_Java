package org.jsp.springAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDepartment {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAutowiringConfig.class);
		Department d = context.getBean(Department.class);
		System.out.println(d.getNames());

	}
}
