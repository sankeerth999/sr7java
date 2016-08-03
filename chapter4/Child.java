package com.practice.chapter4;

public class Child extends Parent{

	public Child(){
		System.out.println("I am in child default constructor");
	}
	public Child(int val){
		System.out.println("I am in child int constructor");
	}
}
