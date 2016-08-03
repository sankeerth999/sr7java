package com.practice.chapter4;

public class MultipleMessengerTest {

	public static void main(String[] args) {

		MultipleMessenger m = new MultipleMessenger();
		m.sendMessage("Hello");
		m.sendMessage("Hello ", "Asshole");
		m.sendMessage("Hello ", "Dense ", "Motherfucker");
//		m.add(10, 10);
//		m.add(5, 6);
		m.add(67, 23.0);
	}

}
