package org.jsp.springAnotation;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "org.jsp.springAnotation" })
@PropertySource("app.properties")
public class MyConfig {
	@Bean
	public List<String> mappingResources() {
		return Arrays.asList("user.hbm.xml", "employee.hbm.xml");
	}

	@Bean
	public Properties hibernateProperties() {
		Properties p = new Properties();
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.formate_sql", "true");
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		return p;
	}
}
