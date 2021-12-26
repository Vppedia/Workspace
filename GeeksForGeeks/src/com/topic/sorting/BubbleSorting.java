package com.topic.sorting;

public class BubbleSorting {
	
	//Ist loop for :Number of passes
	//2nd loop for:number of comparision

	public static void main(String[] args) {

     int [] ar= {5,1,4,2,8};
     
     for(int i=0;i<ar.length-1;i++)
     {
    	 for(int j=0;j<ar.length-1-i;j++)
    	 {
    		 if(ar[j]>ar[j+1])
    		 {
    			 int temp;
    			 temp=ar[j];
    			 ar[j]=ar[j+1];
    			 ar[j+1]=temp;
    		 }
    	 }
     }
     
     for(int i:ar)
     {
    	 System.out.print(i+" ");
     }
     
    

	
	
	}

	
	
}
