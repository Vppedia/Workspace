package com.topic.Array;

public class LeadersInArray {

	public static void main(String[] args) {
		
	    int arr[]= {7,10,4,3,6,5,2};
	    
	       leadersInArray(arr);
	}

	private static void leadersInArray(int[] arr) {
		
	//Efficient Solution
		
		int curr_ldr=arr[arr.length-1];
		
		System.out.print(curr_ldr+" ");
		
		for(int i=arr.length-2;i>0;i--)
		{
			if(arr[i]>curr_ldr)
			{
				curr_ldr=arr[i];
				System.out.print(curr_ldr+" ");
			}
		}
		
		
		
		
		
		
		
 // Naive Approach
//     for(int i=0;i<arr.length;i++)
//     {  
//    	 int flag=0;
//    	 for(int j=i+1;j<arr.length;j++)
//    	 {
//    		 if(arr[i]<arr[j])
//    		 {
//    			 flag=1;
//    		 }
//    	 }
//    	 if(flag==0)
//    		 System.out.print(arr[i]+" ");
//     }
		
	
	
	}

}
