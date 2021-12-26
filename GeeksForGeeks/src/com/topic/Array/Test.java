package com.topic.Array;

import java.util.HashMap;

public class Test {

	
	public static void main(String [] args)
	{
		HashMap m=new HashMap();
		m.put(new String("ABC"),1);
		
		if(m.containsKey("ABC"))
		{
			int n =(int) m.get("ABC");
			System.out.println(n);
		}
		else
		{
			System.out.println("Not Working");
		}
		
	}

}
