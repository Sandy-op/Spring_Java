package org.jsp.springautowiring;

public class Ride {
private Vehicle vehicle;
   public Ride() {
	   
   }
   public void Ride(Vehicle vehicle) {
	   this.vehicle=vehicle;
   }
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}

   
}
