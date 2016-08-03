package com.practice.chapter4;

public class XYZDatabase1 implements XYZDatabase, Driver {

	@Override
	public void loadDriver() {
		System.out.println("XYZ Driver loaded");
	}

	@Override
	public void getConnection() {
		System.out.println("Got Connection");
	}

	@Override
	public void executeQuery() {
		System.out.println("Executed Query");
	}

}
