package com.practice.chapter4;

public class XYZDatabaseUser {

	public static void main(String[] args) {

		XYZDatabase1 x = new XYZDatabase1();
		x.loadDriver();
		x.getConnection();
		x.executeQuery();
	}

}
