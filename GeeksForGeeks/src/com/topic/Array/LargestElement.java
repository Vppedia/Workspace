package com.topic.Array;

public class LargestElement {

	public static void main(String[] args)
	{
	  int arr[]= {40,8,500,100};
	  
	  int largest=0;
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]>arr[largest])
		  {
			  largest=i;
		  }
	  }

	  System.out.println("largest index value "+largest);
	}

}
