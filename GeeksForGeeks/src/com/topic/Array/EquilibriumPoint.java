package com.topic.Array;

public class EquilibriumPoint {

	public static void main(String[] args) {
	
		int arr[]= {3,4,8,-9,20,6};
	    
		boolean result = findEqulibrium(arr);
		System.out.println("Result "+result);

	}

	private static boolean findEqulibrium(int[] arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		int l_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(l_sum==sum-arr[i])
				return true;
			l_sum+=arr[i];
			sum=sum-arr[i];
			
		}
		
		
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			int l_prefix=0,r_prefix=0;
//			//calculate l_prefix
//			
//			for(int j=0;j<i;j++)
//			{
//				l_prefix+=arr[j];
//			}
//			
//			System.out.println("l_prefix "+l_prefix);
//			//calculate r_prefix
//			
//			for(int k=i+1;k<arr.length;k++)
//			{
//				r_prefix+=arr[k];
//			}
//			
//			System.out.println("r_prefix "+r_prefix);
//			
//			if(l_prefix==r_prefix)
//				return true;
//			
//			
//		}
		return false;
		
	
		
	}

}
