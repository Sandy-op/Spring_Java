package org.jsp.springAnotation;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySessionFactory {
	@Autowired
	private MyDataSource dataSource;
	@Autowired
	private List<String> mappingResources;
	@Autowired
	private Properties hibernateProperties;

	public MyDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(MyDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<String> getMappingResources() {
		return mappingResources;
	}

	public void setMappingResources(List<String> mappingResources) {
		this.mappingResources = mappingResources;
	}

	public Properties getHibernateProperties() {
		return hibernateProperties;
	}

	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}

}
