package com.java.stream;


import java.util.Comparator;
import java.util.List;

public class Practice {
	

	interface FuncInterface
	{
	
		void abstractFun(int x,int y);

	
		default void normalFun()
		{
		    System.out.println("Hello");
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		
	   List<Integer> ar=List.of(8,7,6,5,4,3,2);
	
	   ar.stream().sorted( new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			
			if(o1>o2)
				return -1;
			else
				return 1;
			 
		}
	}).forEach(System.out::println);
	 
				
				
				
		
	}
	
	

}
