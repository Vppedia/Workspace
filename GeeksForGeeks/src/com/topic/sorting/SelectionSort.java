package com.topic.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		   int [] ar= {4 ,6,1,8,3};
		   
		   for(int i=0;i<ar.length-1;i++)
		   {
			  int minValue=i;
			  
			  for(int j=i+1;j<ar.length;j++)
			  {
				    if(ar[j]<ar[minValue])
				    {
				    	minValue=j;
				    }
			  }
			  
			  int temp=ar[i];
			  ar[i]=ar[minValue];
			  ar[minValue]=temp;
			   
		   }
		   
		   for(int i:ar)
			   System.out.print(i+" ");

	}

}
