package com.topic.Array;

public class SortedArray {
	
	public static void main(String[] args)
	{
		int arr[]= {100,20,100};
		
		boolean result=isSorted(arr);
		System.out.println("Result "+result);
		
	}

	private static boolean isSorted(int[] arr) {
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
				return false;
		}
		
		return true;
	}


}
