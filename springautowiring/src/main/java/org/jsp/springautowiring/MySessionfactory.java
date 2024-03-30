package org.jsp.springautowiring;

import java.util.List;
import java.util.Properties;

public class MySessionfactory {
private MyDataSource dataSource;
private List<String> mappingResources;
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
