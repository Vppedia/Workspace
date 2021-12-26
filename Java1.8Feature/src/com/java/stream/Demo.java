package com.java.stream;

import java.util.HashMap;

public class Demo {
	
	public static void main(String[] args) {
		int arr[]={2,8,7,2,2,5,2,3,1,2,2};
		
		HashMap<Integer,Integer> value=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(value.containsKey(arr[i]))
			{
				int of=value.get(arr[i]);
				int nf=of+1;
				value.put(arr[i],nf);

			}
			else
			{
				value.put(arr[i],1);
			}
		}
		System.out.println(value);
		
		for(Integer key:value.keySet())
		{
			System.out.println(key +" "+value.get(key));
		}


	}
}
