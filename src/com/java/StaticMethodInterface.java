package com.java;

interface StaticMethod{
	void show();
	
	public static void staticMethod() {
		System.out.println("Static Method1");
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
}
public class StaticMethodInterface {
	public static void main(String[] args) {
		StaticMethod obj=()->System.out.println("Abstract Method");
		obj.show();
		
		StaticMethod.staticMethod();
		System.out.println(StaticMethod.add(2,4));
	}
}
