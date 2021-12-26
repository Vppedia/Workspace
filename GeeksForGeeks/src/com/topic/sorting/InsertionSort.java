package com.topic.sorting;

public class InsertionSort {

	public static void main(String[] args) {
	
		int [] arr= {4,3,2,10,12,1,5,6};
		
		for(int i=1;i<arr.length-1;i++)
		{
			
			while(arr[i-1]>arr[i])
			{
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
				
				if(i!=0)
				i--;
			}
			
		}
		
		    for(int i:arr)
			System.out.print(i+" ");
		
		
	}

}
