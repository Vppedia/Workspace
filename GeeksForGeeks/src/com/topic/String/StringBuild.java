package com.topic.String;

public class StringBuild {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
	   
		//Printing content of the String
		System.out.println(sb);
		
		//As they are set method are also their as SB is Immutible
		
		sb.setCharAt(0, 'd');
		System.out.println(sb);
		
		//we can insert in Sb
		
		sb.insert(3, "tm");

		System.out.println(sb);
		
		sb.append("World");
		System.out.println(sb);
		
		sb.delete(0, 2);
		System.out.println(sb);
		
		
		
//		long prev = System.currentTimeMillis();
//		
//		String s="v";
//		for(int i=0;i<100000;i++)
//		{
//			s+="a";
//			
//		}
//		
//		long curr = System.currentTimeMillis();
//		
//		long duration=curr-prev;
//		
//		System.out.println("String duration is "+duration);
//		
//		
//  long prev1 = System.currentTimeMillis();
//		
//		StringBuilder ssb=new StringBuilder("V");
//		for(int i=0;i<1000;i++)
//		{
//			ssb.append("a");
//			
//		}
//		
//		long curr1 = System.currentTimeMillis();
//		
//		long duration1=curr1-prev1;
//		
//		System.out.println("String Builder duration is "+duration1);
		
		
	}

}
