package com.topic.Array;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		int [] arr= {10,20,20,30,30,30};
		
		int res=removeDuplicate(arr);
		System.out.println(res);

	}

	private static int removeDuplicate(int[] arr) {
		
	  
	    int res=1;
	    for(int i=1;i<arr.length;i++)
	    {
	    	if(arr[i]!=arr[res-1])
	    	{
	    		arr[res]=arr[i];
	    		res++;
	    	}
	    }
	    
	   return res;
		
}

}
