package com.practice.chapter4;

public class PrinterTest {

	public static void main(String[] args) {

		Printer p1 = new Printer();
		
		p1.printDocument();
		Printer.print();
		System.out.println(Printer.paperCount);

	}

}
