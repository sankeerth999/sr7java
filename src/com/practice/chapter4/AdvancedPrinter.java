package com.practice.chapter4;

public class AdvancedPrinter {

	private String printType;
	
	AdvancedPrinter(String type){
		printType = type;
	}
	public void printDocument(String text){
		System.out.println(text + " printed in " + printType);	
	}
}
