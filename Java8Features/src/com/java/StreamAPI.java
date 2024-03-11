package com.java;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<>();
		
		list.add(1);
		list.add(30);
		list.add(2);
		list.add(23);
		list.add(21);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(8);
		
		//Mapping
		System.out.println("Mapping");
		list.stream()
			.map(num->num*num)
			.forEach(System.out::println);
		
		System.out.println("***********");
		//Filtering
		System.out.println("Filtering");
		list.stream()
			.filter(num->num%2==0)
			.forEach(System.out::println);
		
		System.out.println("************");
		//Reducing
		System.out.println("Reducing");
		int sum=list.stream()
					.reduce(0,(acc, num)->acc+num);
					System.out.println(sum);
					
		System.out.println("************");
		//Sorting
		System.out.println("Sorting");
		list.stream()
			.sorted()
			.forEach(System.out::println);
	}
}
