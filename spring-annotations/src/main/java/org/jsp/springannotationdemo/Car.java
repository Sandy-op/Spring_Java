package org.jsp.springannotationdemo;

import org.springframework.stereotype.Component;

@Component(value = "myCar")
public class Car {
	public void start() {
		System.out.println("Car has been started");
	}
}
