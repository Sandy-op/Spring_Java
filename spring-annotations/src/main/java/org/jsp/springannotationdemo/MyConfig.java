package org.jsp.springannotationdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"org.jsp.springannotationdemo"})
public class MyConfig {
	
}
