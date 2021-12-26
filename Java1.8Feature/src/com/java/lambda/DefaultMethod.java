package com.java.lambda;

interface Greeting
{
   public String greet(String name);	
   
   default public void hello()
   {
	   System.out.println("Helloo from interface!!!");
   }
}

class GreetingIml implements Greeting
{

	@Override
	public String greet(String name) {

       return "Good Moring "+name;
	}
	

}

public class DefaultMethod {
	
	public static void main(String[] args)
	{
		  Greeting g=new GreetingIml();
		 System.out.println(g.greet("vivek")); 
		 g.hello();
		
	}

}
