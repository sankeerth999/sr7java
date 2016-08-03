package com.practice.chapter4;

public class ProcessorTest {

	public static void main(String[] args) {
		System.out.println("Using Processor");
		Processor p1 = new Processor();
		p1.execute();
		
		System.out.println("\nUsing Advanced Processor");
		AdvancedProcessor p2 = new AdvancedProcessor();
		p2.execute();

	}

}
