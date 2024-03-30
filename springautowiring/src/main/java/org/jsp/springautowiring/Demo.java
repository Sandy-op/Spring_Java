package org.jsp.springautowiring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean, DisposableBean {
	static {
		System.out.println("Demo Class Has been loaded");
	}

	public Demo() {
		System.out.println("Demo Object has been created");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Demo has been initialized");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Demo has been destroyed");

	}

}
