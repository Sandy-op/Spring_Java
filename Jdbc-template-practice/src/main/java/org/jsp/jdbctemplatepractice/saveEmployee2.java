package org.jsp.jdbctemplatepractice;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class saveEmployee2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name, salary, desgination");
		int id = sc.nextInt();
		String name = sc.next();
		double salary = sc.nextDouble();
		String desgination = sc.next();
		String sql = "insert into employee values(?,?,?,?)";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		int r = template.update(sql, id, name, salary, desgination);
		System.out.println(r + " rows inserted");
		((ClassPathXmlApplicationContext) context).close();
	}
}
