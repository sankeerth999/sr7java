package com.practice.chapter4;

public class MultipleMessenger {

	public void sendMessage(String msg1){
		System.out.println(msg1 + " sent to Mainframe");
	}
	public void sendMessage(String msg1, String msg2){
		System.out.println(msg1 + msg2 + " sent to mainframe");
	}
	public void sendMessage(String msg1, String msg2, String msg3){
		System.out.println(msg1 + msg2 + msg3 + " sent to mainframe");
	}
	public void add(int i, double j){
		System.out.println(i + j);
	}
	public void add(double i, int j){
		System.out.println(i + j);
	}
}
