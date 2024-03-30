package org.jsp.springautowiring;

public class Car implements Vehicle{
	@Override
	public void startRide() {
		System.out.println("Car Ride Started");
	}
}
