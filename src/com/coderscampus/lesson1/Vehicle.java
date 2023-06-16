package com.coderscampus.lesson1;

public class Vehicle {

	private String vehicleType;
	private String yearBuilt;
	private String vehicleMake;
	private String vehicleModel;
	private String numModelVehicleSoldCurrentCalendarYear;
	private String numEVVehicles;
	private String numCombustionEngineVehicles;
	private String numHybridVehicles;
	
	public void info () {
		System.out.println("I am a vehicle");
	}
	
	public void info(String yearBuilt, String vehicleMake, String vehicleModel) {
		System.out.println("I'm a brand new " + yearBuilt + " " + vehicleMake + " " + vehicleModel
				+ ", with todays modern features and technology");
	}
	
	public Vehicle() {
		System.out.println("[Inside the Vehicle constructor]");
		this.vehicleType = "Vehicle type, not set";
		this.yearBuilt = "Year built, not set";
		this.vehicleMake = "Vehicle make, not set";
		this.vehicleModel = "Vehicle model, not set";
		this.numModelVehicleSoldCurrentCalendarYear = "Number model vehicles sold in current calendar year, not set";
		this.numEVVehicles = "Number of EV vehicles, not set";
		this.numCombustionEngineVehicles = "Number of cumbustion engine vehicles not set";
		this.numHybridVehicles = "Number of hyrbid vehicles, not set";
	}

	public String getNumHybridVehicles() {
		return numHybridVehicles;
	}

	public void setNumHybridVehicles(String numHybridVehicles) {
		this.numHybridVehicles = numHybridVehicles;
	}

	public String getNumModelVehicleSoldCurrentCalendarYear() {
		return numModelVehicleSoldCurrentCalendarYear;
	}

	public void setNumModelVehicleSoldCurrentCalendarYear(String numModelVehicleSoldCurrentCalendarYear) {
		this.numModelVehicleSoldCurrentCalendarYear = numModelVehicleSoldCurrentCalendarYear;
	}

	public String getNumEVVehicles() {
		return numEVVehicles;
	}

	public void setNumEVVehicles(String numEVVehicles) {
		this.numEVVehicles = numEVVehicles;
	}

	public String getNumCombustionEngineVehicles() {
		return numCombustionEngineVehicles;
	}

	public void setNumCombustionEngineVehicles(String numCombustionEngineVehicles) {
		this.numCombustionEngineVehicles = numCombustionEngineVehicles;
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
