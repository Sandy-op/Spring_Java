package org.jsp.springannotationdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages= {"org.jsp.springannotationdemo"})
@PropertySource(value="app.properties")
public class MyConfig {
	
}
