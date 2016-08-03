package com.practice.chapter4;

public class MainframeMessenger {

	public void formatMessage(String str){
		System.out.println("Message formatted " + str.toUpperCase());
	}
	public void sendMessage(String message){
		formatMessage(message);
		System.out.println("Message " + message + " sent to Mainframe");
	}
}
