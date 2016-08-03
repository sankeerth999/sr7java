package com.practice.chapter4;

public class ConstructorTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Parent(10);
		
		Child c1 = new Child();
		Child c2 = new Child(10);
	}

}
