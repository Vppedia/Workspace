package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class Java8Streams  {
	
	   public static void main(String[] args)
	   {
			List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);

			asList.stream().forEach(i ->

			{
				System.out.println(i);
				System.out.println(i * 2);
			}

			);
			
			asList.stream().map(i->
			{
				return i+"Hi";
			}).forEach(i->System.out.println(i));;
			
			
		   
		   
		   
		   
		   
	   }
	
	
	
}
