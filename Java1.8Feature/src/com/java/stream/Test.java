package com.java.stream;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Test {
	
	
	interface FuncInterface
	{
		// An abstract function
		void abstractFun(int x);

		// A non-abstract (or default) function
		default void normalFun()
		{
		System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
	
		//List<Integer> arr= List.of(1,2,3,4,5,6,7,8);
		  
		//List<Integer> newList = arr.stream().filter(i->i%2==0).collect(Collectors.toList());
        
		//newList.forEach(e->System.out.println(e));
		//newList.forEach(System.out::println);
		
		//List<Integer> collect = arr.stream().map(i->i*i).collect(Collectors.toList());
		
		//collect.forEach(System.out::println);
		
        //String [] str= {"vivek","Pandey","Suraj","Parajapat"};
        //List<String> asList = Arrays.asList(str);
        //asList.stream().filter(e->e.startsWith("P")).forEach(t->System.out.println(t));
		
System.out.println("---------------------------------------------------------------------------------------");	
		// Java program to demonstrate lambda expressions
		// to implement a user defined functional interface.

		// A sample functional interface (An interface with
		// single abstract method
		

		
				// lambda expression to implement above
				// functional interface. This interface
				// by default implements abstractFun()
				FuncInterface fobj = (int x)->System.out.println(2*x);

				// This calls above lambda expression and prints 10.
				fobj.abstractFun(5);
				fobj.normalFun();
			
		

		
		
		
		
		
		
	}
	
	

}
