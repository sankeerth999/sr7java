package com.practice.chapter4;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		
		c1.setFirstName("Sankeerth");
		c1.setLastName("Pinninti");
		c1.setAddress("502, Rhode Island Ave, Cherry Hill, NJ 08002");
		
		System.out.println("First Name: " + c1.getFirstName()
							+ "\nLast Name: " + c1.getLastName()
							+ "\nAddress: " + c1.getAddress());
	}

}
