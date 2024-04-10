package org.jsp.springtest;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.jsp.springtest")
public class ProductConfig {
	@Bean
	public EntityManager entityManager() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
}
