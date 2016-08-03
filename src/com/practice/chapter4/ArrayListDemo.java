package com.practice.chapter4;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("HI");
		al.add("HELLO");
		al.add("GHJI");
		
		System.out.println(al);
		for(String i : al){
			System.out.println(i);
		}
	}

}
