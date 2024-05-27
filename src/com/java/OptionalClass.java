package com.java;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		
		String[] str=new String[10];
		str[4]="Rohit";
		
		Optional<String>opt=Optional.ofNullable(str[5]);
		if(opt.isPresent()) {
			String ans=str[5].toUpperCase();
			System.out.println(ans);
		}
		else {
			System.out.println("String is Not Found");
		}
	}
}
