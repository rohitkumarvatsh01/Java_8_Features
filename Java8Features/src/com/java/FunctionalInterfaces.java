package com.java;

@FunctionalInterface
interface Functional{
	//Abstract Method- SAM
	void show();
	
	//It Contains Multiple Static Method
	public static void staticMethod1() {
		System.out.println("Static Method 1");
	}
	public static void staticMethod2() {
		System.out.println("Static Method 2");
	}
	
	//It Contains Multiple Default Method
	default void defaultMethod1() {
		System.out.println("Default Method 1");
	}
	default void defaultMethod2() {
		System.out.println("Default Method 2");
	}
}
public class FunctionalInterfaces {
	public static void main(String[] args) {
		Functional obj=()->System.out.println("Single Abstract Method");
		obj.show();
		
		Functional.staticMethod1();
		Functional.staticMethod2();
		
		obj.defaultMethod1();
		obj.defaultMethod2();
	}
}
