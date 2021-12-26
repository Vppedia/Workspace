package com.topic.Array;

public class MaxDifference {

	public static void main(String[] args) {

       int arr[]= {2,3,10,6,4,8,1};
       
         int result= maxDifference(arr);	
         System.out.println("Result "+result);
		
	}

	private static int maxDifference(int[] arr) {
		
		int result=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]-arr[i]>result)
				{
					result=arr[j]-arr[i];
				}
				
			}
		}
		
		return result;
	}

}
