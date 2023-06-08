package com.coderscampus.lesson1;

public class ChevyVehicle extends Vehicle {

	// 'is a' - blank IS A - means you have inheritance
	// 'has a'- blank HAS A - means it's a property
	
	// Don't use inheritance and polymorphism becuase you can. 
	// Use them when it make sense to use them.
	
	// When to use inheritance and polymorphism
	// When one class 'IS A' nother class, that's a great time to use inheritance 
	// When one method is very similar to another method, perfect; use overloading there.

	public ChevyVehicle() {
		System.out.println("[Inside the Chevy Vehicle constructor]");
//		System.out.println("This is a Chevy vehicle");
		this.setNumModelVehicleSoldCurrentCalendarYear("26 cars");
		this.setNumEVVehicles("2 cars");
		this.setNumHybridVehicles("0 cars");
	}

	// OVERLOADING - a feature in Java that allows a class to have more than one
	// method with the same name, but different parameters
	public void info() {
		System.out.println("I'm a new Chevy with todays modern features and technology");
	}

	public void info(String yearBuilt, String vehicleMake, String vehicleModel) {
		System.out.println("I'm a brand new " + yearBuilt + " " + vehicleMake + " " + vehicleModel
				+ ", with todays modern features and technology");
	}
}