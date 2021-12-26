package com.topic.Array;

public class SecondLargest {

	public static void main(String[] args) {
		
		int arr[]= {10,10,10};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}	
		
		}
		int scdMax=arr[0],j=-1;
		
		for(int i=1;i<arr.length;i++)
		{   
			if(arr[i]!=max)
			{
				if(scdMax<arr[i])
				{
					scdMax=arr[i];
					j=i;
				}	
			
			}
		
		}
		
		System.out.println("Second Max "+scdMax+ " At "+j);
		
		
		
	
	
	}

}
