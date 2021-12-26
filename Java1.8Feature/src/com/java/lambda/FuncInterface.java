package com.java.lambda;

@FunctionalInterface
interface Calculator
{
	public String add(int a,int b);
	
}

public class FuncInterface {

  public static void main(String[] args)
  {
	
	 Calculator cal=  ( a ,b)->
	  {
		  return "Normal Calci "+(a+b);
	  };
	  
	  Calculator cal1=  ( a ,b)->
	  {
		  return "Scientific Calci "+(a+b);
	  };
	  
	 System.out.println(cal.add(1,2)); ;
	 System.out.println(cal1.add(5,6)); ;
	 
	 CalculatorHelper(cal, 5,9);
  }
  
  public static void  CalculatorHelper(Calculator newcal,int x,int y)
  {
	  System.out.println(newcal.add(x,y));
  }

	  

}
