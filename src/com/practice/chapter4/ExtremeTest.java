package com.practice.chapter4;

public class ExtremeTest {

	public static void main(String[] args) {

		System.out.println("Using Oracle database V5");		
		ExtremeV5 v5 = new ExtremeV5(4);
		v5.execute();
		
		System.out.println("Using Oracle database V6");			
		ExtremeV6 v6 = new ExtremeV6(4);
		v6.execute();

	}

}
