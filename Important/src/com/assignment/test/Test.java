package com.assignment.test;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args)
	{
		int ar[]= {3,2,5};
		
		int[] sort1 = sort1(ar);
		
		for(int i:sort1)
		{
			System.out.println(i);
		}
		
		
		
		
	}
	
	public static   int[] sort1( int[] ar)
	{
	    
	    for(int i=0;i<ar.length-1;i++)
	    {
	    	for(int j=i+1;j<ar.length-i;j++)
	    	{
	    		if(ar[i]>ar[j])
	    		{
	    			int ii=ar[i];
	    			ar[i]=ar[j];
	    			ar[j]=ii;
	    		}
	    	}
	    }
	    
	    return ar;

	}
	




}

