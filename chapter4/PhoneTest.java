package com.practice.chapter4;

public class PhoneTest {

	public static void main(String[] args) {

		PhoneNumber ph = new PhoneNumber();
		
		String number = ph.getNumber();
		String str = ph.toString();
		
		System.out.println(str);
		System.out.println(number);
	}

}
