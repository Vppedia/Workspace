package com.topic.Array;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		
	  int arr[]= {2,3,0,5};
	    
	int ar[]=  moveZeroToEnd(arr);
	
	for(int i:ar)
	{
		System.out.print(i+" ");
	}
	  

	}

	private static int[] moveZeroToEnd(int[] arr) {
		
		//Method 2 -Efficient Solution
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp;
				
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		
		return arr;
		
		
		
		
//		
//		//Naive Approach
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==0)
//			{
//				for(int j=i+1;j<arr.length;j++)
//				{
//					if(arr[j]!=0)
//					{
//						int temp;
//						temp=arr[i];
//						arr[i]=arr[j];
//						arr[j]=temp;
//						
//						break;
//						
//					}
//				}
//			}
//		}
//		
//		
//		return arr;
//		


//    Method 1		
//		int ar[]=new int[arr.length];
//		int res=1;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]!=0)
//			{
//				ar[res-1]=arr[i];
//				res++;
//			}
//		}
//		
//		return ar;
		
	}

}
