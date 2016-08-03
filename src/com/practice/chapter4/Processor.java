package com.practice.chapter4;

public class Processor {

	public void begin(){
		System.out.println("Processing Initiated");
	}
	
	public void process(){
		System.out.println("Processing Step 1");
		System.out.println("Processing Step 2");
		System.out.println("Processing Step 3");
		System.out.println("Processing Step 4");
	}
	
	public void stop(){
		System.out.println("Processing stopped");
	}
	
	public void execute(){
		begin();
		process();
		stop();
	}
}
