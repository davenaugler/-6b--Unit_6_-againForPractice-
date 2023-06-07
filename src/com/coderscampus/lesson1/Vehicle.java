package com.coderscampus.lesson1;

public class Vehicle {

	// Example of vehicle: 2012 Mazda 3 (car)
	private String vehicleType;
	private String yearBuilt;
	private String vehicleMake;
	private String vehicleModel;
	
	public Vehicle () {
		this.vehicleType = "Vehicle type, not set";
		this.yearBuilt = "Year built, not set";
		this.vehicleMake = "Vehicle make, not set";
		this.vehicleModel = "Vehicle model, not set";
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

}
