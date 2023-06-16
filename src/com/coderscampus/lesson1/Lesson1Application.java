package com.coderscampus.lesson1;

public class Lesson1Application {

	public static void main(String[] args) {
//		Topics covered
//		[X] - Inheritance
//		[X] - Constructors and Sub-classes
//		[X] - Overriding
//		[] - Overloading
//		[] - [Exercise] - Practice Inheritance
//		[] - Casting 
//		[] - Protected and Package Access Modifiers
//		[] - Object Wrapper Classes 
//		[] - Writing to Files
		

		
		Vehicle chevyVehicle = new ChevyVehicle();
		
		// Casting
		ChevyVehicle castedChevyVehicle = (ChevyVehicle)chevyVehicle;
		
		castedChevyVehicle.info("Chevy");
		// ((ChevyVehicle)chevyVehicle).info("Chevy");
		System.out.println(chevyVehicle.getNumModelVehicleSoldCurrentCalendarYear());
		System.out.println(chevyVehicle.getNumEVVehicles());
		System.out.println(chevyVehicle.getNumHybridVehicles());
		chevyVehicle.info("2023", "Chevy", "Silverado");
		System.out.println("------------------------------------------------------------");
		
		
		Vehicle mazdaVehicle = new MazdaVehicle();
		
		System.out.println(mazdaVehicle.getNumModelVehicleSoldCurrentCalendarYear());
		System.out.println(mazdaVehicle.getNumEVVehicles());
		System.out.println(mazdaVehicle.getNumHybridVehicles());
		mazdaVehicle.info();
		System.out.println("------------------------------------------------------------");
		
		Vehicle classicChevyVehicle = new ClassicChevyVehicle();
		
		System.out.println(classicChevyVehicle.getNumModelVehicleSoldCurrentCalendarYear());
		System.out.println(classicChevyVehicle.getNumEVVehicles());
		System.out.println(classicChevyVehicle.getNumHybridVehicles());
		classicChevyVehicle.info();
		System.out.println("------------------------------------------------------------");
		
		

		
	}

}
