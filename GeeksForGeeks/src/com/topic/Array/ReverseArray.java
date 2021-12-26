package com.topic.Array;
public class ReverseArray {
	
	public static void main(String[] args)
	{
		int [] arr= {5,10,15,20};
		
		arr=reverseArray(arr);
	   
		for(int i: arr)
			System.out.print (i+" ");
	 
	}

	private static int [] reverseArray(int [] arr) {
		
		int low=0,high=arr.length-1;
		
		while(low<high)
		{
			int temp;
			
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			
			low++;
			high--;
			
			
		}
		
		return arr;
		
		
	}

	
	
	
//	Method 1
//	public static void main(String[] args)
//	{
//		Integer[] arr= {5,10,15,20};
//		
//		arr=reverseArray(arr);
//	   
//		for(Integer i: arr)
//			System.out.print (i+" ");
//	 
//	}
//
//	private static Integer[] reverseArray(Integer[] arr) {
//		
//		Arrays.sort(arr, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(o1>o2)
//					return -1;
//				else
//					return 1;
//				
//			}
//		});
//		
//		return arr;
//	}
//
	
	
	
}
