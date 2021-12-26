package com.assignment.test;

class Parent {
	
	public void m1()
	{
		System.out.println("Parent wissen!!");
	}
	
	public void m2()
	{
		System.out.println("Parent wissen2 !!");
	}


}

class Child extends Parent
{
	public void m1()
	{
		System.out.println("Child wissen!!");
	}
	
	

}

public class Wissen
{
	public static void main(String[] args)
	{
		Parent w=new Child();
		w.m2();
		
	}	

}





