package com.bharath.junit5;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 
		 int a=4;
		 int b=5;
		 Person p= new Person();
		 
		 int result= getResult(a,b);
		  getResult(p);
	 System.out.println(p.a);	 
		 for(int i=1;i<=n;i++)
		 {
			 
			 for(int k=n-i;k>=0;k--)
			 {
				 System.out.print(" ");
			 }
			 
			 
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		
	}
	
	public static int getResult(int i,int j)
	{
		
		return i+5;
	}
	public static void getResult(Person p)
	{
		p.a=p.a+5;
		//return i+5;
	}


}
