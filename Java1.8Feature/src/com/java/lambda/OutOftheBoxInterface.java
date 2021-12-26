package com.java.lambda;

import java.util.function.Function;

public class OutOftheBoxInterface {
	
	public static void main(String[] args)
	{
		
		Function<String,Integer> arr=(h)->{
			
			return 100;
		};
		System.out.println(arr.apply("hh"));
	}

}
