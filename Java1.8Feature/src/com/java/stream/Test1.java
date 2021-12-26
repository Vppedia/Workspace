package com.java.stream;

public class Test1 {
	

	public static void main(String[] args)
	{
		
		int arr[]= {1,2,3,4,9,8};
		int n=6;
		int getmaxprofit = getmaxprofit(arr,6);
		System.out.println(getmaxprofit);
	} 
	
	public static int getmaxprofit(int[] p, int n)
	{

		int i, j, max = 0;
		int msis[] = new int[n];

		for (i = 0; i < n; i++) 
		{

			msis[i] = p[i];

		}
		
		for (i = 1; i < n; i++) 
		{
			
			
			for (j = 0; j < i; j++) 
			{
				
				
				if (p[i] > p[j] && p[i] % p[j] == 0 && msis[i] < msis[j] + p[i])
				{
					
					msis[i] = msis[j] + p[i];
				}
			}
		}
		for (i = 0; i < n; i++) 
		{
			
			if (max < msis[i])
			{
				
				max = msis[i];
			}
		}
		return max;
	}

}
