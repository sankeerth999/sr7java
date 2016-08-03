package com.practice.chapter4;

public class BookTest {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.setPrice(24.99);
		System.out.println(b.getPrice());
		Book x = new Book();
		x.setPrice(35.43);
		displayPrice(x);
	}
	
	static void displayPrice(Book b1){
		double price = b1.getPrice();
		System.out.println(price);
	}

}
