package com.practice.chapter4;

public class Honda extends Car{

	@Override
	public void assembleTyres() {
		System.out.println("Assembled GoodYear tyres");
	}

	@Override
	public void addCover() {
		System.out.println("Added metallic cover");	
	}

	@Override
	public void addEngine() {
		System.out.println("Added 500HP engine");
	}

	@Override
	public void addSeats() {
		System.out.println("Added Racing leather seats");	
	}

	@Override
	public void startCar() {
		System.out.println("Car started with Autostart");	
	}

	@Override
	public void shiftGears() {
		System.out.println("Has automatic Transmission");
	}

	@Override
	public void drive() {
		System.out.println("Driving at 80mph");
	}
	
}
