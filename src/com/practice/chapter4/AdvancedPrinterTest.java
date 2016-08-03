package com.practice.chapter4;

public class AdvancedPrinterTest {

	public static void main(String[] args) {

		AdvancedPrinter bw = new AdvancedPrinter("Black and White");
		bw.printDocument("Test document 1");
		
		AdvancedPrinter color = new AdvancedPrinter("Color");
		color.printDocument("Test document 2");

	}

}
