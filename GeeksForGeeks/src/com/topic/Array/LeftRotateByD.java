package com.topic.Array;

public class LeftRotateByD {
	
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		int  d=2;
		
//		for(int i=0;i<d;i++)
//		{
//			leftRotateByD(arr);
//		}
		
		//Method 2
	  //  int ar[]=leftRotateByD(arr,d);
		
		
		//Method 3
		leftRotateByD(arr,d);

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	
	private static void reverseArray(int[] arr, int i, int d) {
		
		int low=i;
		int high=d;
		
		while(low<high)
		{
			int temp;
			
		  temp=	arr[low];
		  arr[low]=arr[high];
		  arr[high]=temp;
		  low++;
		  high--;
		}
	
		
	}

	private static int[] leftRotateByD(int[] arr,int d) {
		
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,arr.length-1);
		reverseArray(arr,0,arr.length-1);		
		
		
		
		return arr;
		
		
		
//		
//		int temp[]=new int[d];
//		
//		for(int i=0;i<d;i++)
//		{
//			temp[i]=arr[i];
//		}
//		
//		for(int i=d;i<arr.length;i++)
//		{
//			arr[i-d]=arr[i];
//		}
//		
//		int res=1;
//		for(int i=arr.length-d;i<arr.length;i++)
//		{
//			arr[i]=temp[res-1];
//			res++;
//		}
//		
//		return arr;
//		
		
//		
//		int temp=arr[0];
//		for(int i=1;i<arr.length;i++)
//		{
//			arr[i-1]=arr[i];
//		}
//		
//		arr[arr.length-1]=temp;
//		
//		return arr;
//		
	}

	

}
