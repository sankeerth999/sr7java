package com.practice.chapter4;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		Calculator c3 = c2;
		
		c1.sum(4, 5);
		System.out.println(c1.result);
		
		c2.multiply(4, 5);
		System.out.println(c3.result);
		
		c3.multiply(3, 2);
		System.out.println(c2.result);

	}

}
