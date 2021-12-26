package com.topic.Array;

public class LeftRotateBy1 {
	
	public static void main(String[] args)
	{
		int ar[]= {30,5,20};
		 int arr[]=leftRotateByOne(ar);
		 for(int i:arr)
		 {
			 System.out.print(i+" ");
		 }
	}

	private static int[] leftRotateByOne(int[] ar) {
		
		int temp=ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			ar[i-1]=ar[i];
		}
		
		ar[ar.length-1]=temp;
		return ar;
	}

}
