package com.java;

//No Arguments
interface Lambda{
	void show();
}

//Single Arguments
interface LambdaOneParameter{
	String display(String str);
}

//Multiple Arguments
interface LambdaMultipleParameter{
	int add(int a, int b);
}

public class LambdaFunction {
	public static void main(String[] args) {
		
		//No Arguments
		Lambda obj1=()->System.out.println("Lambda Function");
		obj1.show();
		
		//One Arguments
		LambdaOneParameter obj2=(name)->{
			return "Hello "+name;
		};
		System.out.println(obj2.display("Rohit"));
		
		//Multiple Arguments
		LambdaMultipleParameter obj3=(a, b)->{
			return a+b;
		};
		System.out.println(obj3.add(3, 4));
		
	}
}
