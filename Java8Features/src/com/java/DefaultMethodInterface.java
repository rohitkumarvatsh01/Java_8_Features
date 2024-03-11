package com.java;
interface DefaultMethod{
	void show();
	
	default void defaultMethod1() {
		System.out.println("Default Method 1");
	}
	
	default int add(int a, int b) {
		return a+b;
	}
}
class Child implements DefaultMethod{
	@Override
	public void show() {
		System.out.println("Abstract Method");
	}
}
public class DefaultMethodInterface {
	public static void main(String[] args) {
		DefaultMethod obj=new Child();
		obj.show();
		
		obj.defaultMethod1();
		System.out.println(obj.add(3,5));
	}
}
