package com.practice.chapter4;

class Helper3{
	public void m3(){
		System.out.println("I am helper 3");
	}
}

class Helper4{
	public void m4(){
		System.out.println("I am helper 4");
	}
}

class Helper5{
	public void m5(){
		System.out.println("I am helper 5");
	}
}

class Helper2{
	public void m2(){
		System.out.println("I am helper 2");
		Helper3 h3 = new Helper3();
		h3.m3();
		Helper5 h5 = new Helper5();
		h5.m5();
	}
}

public class Foo {
	public void m1(){
		System.out.println("I am foo");
		Helper2 h2 = new Helper2();
		h2.m2();
		Helper4 h4 = new Helper4();
		h4.m4();
	}

}
