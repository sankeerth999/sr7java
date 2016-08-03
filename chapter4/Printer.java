package com.practice.chapter4;

public class Printer {

	static int paperCount = 1;
	
	static void print(){
		if (paperCount > 0){
			paperCount = paperCount - 1;
			System.out.println("Document Printed");
		}
		else{
			System.out.println("Load paper!");
		}
	}
	
	void printDocument(){
		print();
	}
}
