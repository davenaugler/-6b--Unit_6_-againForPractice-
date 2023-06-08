package com.coderscampus.lesson1;

public class ClassicChevyVehicle extends ChevyVehicle {
	
	public ClassicChevyVehicle () {
		System.out.println("[Inside the Classic Chevy Vehicle constructor]");
		this.setNumModelVehicleSoldCurrentCalendarYear("4 cars");
		this.setNumEVVehicles("0 cars");
		this.setNumHybridVehicles("0 cars");
	}
	
	public void info () {
		System.out.println("I'm an old Classic Chevy that'll get you where you need to go");
	}
	


}
