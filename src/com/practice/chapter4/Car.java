package com.practice.chapter4;

public abstract class Car {

	public abstract void assembleTyres();
	public abstract void addCover();
	public abstract void addEngine();
	public abstract void addSeats();
	public abstract void startCar();
	public abstract void shiftGears();
	public abstract void drive();
	
	public final void testDrive(){
		assembleTyres();
		addCover();
		addEngine();
		addSeats();
		startCar();
		shiftGears();
		drive();
	}
	
}
