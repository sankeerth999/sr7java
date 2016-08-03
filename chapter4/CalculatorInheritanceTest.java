package com.practice.chapter4;

public class CalculatorInheritanceTest {

	public static void main(String[] args) {

		BasicCalculator bc = new BasicCalculator();
		double result = bc.sum(10, 20);
		System.out.println(result);
		
		ScientificCalculator sc = new ScientificCalculator();
		result = sc.sum(20, 30);
		System.out.println(result);
		result = sc.multiply(20, 30);
		System.out.println(result);
		
		AdvancedCalculator ac = new AdvancedCalculator();
		result = sc.sum(20, 35);
		System.out.println(result);
		result = sc.multiply(20, 3);
		System.out.println(result);
		result = ac.divide(30, 5);
		System.out.println(result);
	}

}
