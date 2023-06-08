package com.coderscampus.lesson1;

public class MazdaVehicle extends Vehicle {

	// 'is a' - blank IS A  - means you have inheritance 
	// 'has a'- blank HAS A - means it's a property
	
	public MazdaVehicle() {
		System.out.println("[Inside the Mazda Vehicle constructor]");
//		System.out.println("This is a Mazda vehicle");
		this.setNumModelVehicleSoldCurrentCalendarYear("9 cars");
		this.setNumEVVehicles("1 car");
		this.setNumHybridVehicles("1 car");
	}
	
	
	// OVERRIDING - Creating the exact same method signature as the parent. It means
	// we want to get rid of the parent functionality and we want it to do something
	// different within the child class. When overriding a method the parent method
	// is never ran, only the child method is ran. Methods and Constructors, when it comes to
	// inheritance and polymorphism behave differently. 
	public void info () {
		System.out.println("I'm a new Mazda and I'm a mid level vehicle");
	}	
}
