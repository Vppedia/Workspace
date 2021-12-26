package com.topic.Array;

public class PrefixSum {

	public static void main(String[] args) {
     
		int arr[]= {2,8,3,9,6,5,4};
		
	int result=	getSum(2,4,arr);
	
	System.out.println("Result "+result);


	}

	private static int getSum(int l, int h ,int arr[]) {
		
		int ar[]=new int[arr.length];
		 int prefix_sum=0;
		 
		for(int k=0;k<arr.length;k++)
		{
			prefix_sum+=arr[k];
			ar[k]=prefix_sum;
		}
		
		if(l!=0)
			return (ar[h]-ar[l-1]);
		else
			return ar[h];
		
		
	}

}
