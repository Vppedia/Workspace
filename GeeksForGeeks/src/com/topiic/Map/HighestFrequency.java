package com.topiic.Map;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
	   HashMap<Character,Integer>map= new HashMap<>();
	   
	   for(int i=0;i<st.length();i++)
	   {
		   char ch=st.charAt(i);
		   
		   if(map.containsKey(ch))
		   {
			   int of=map.get(ch);
			   int nf=of+1;
			   map.put(ch, nf);
			   
		   }
		   else
		   {
			   map.put(ch, 1);
		   }
		   
	   }
	   
	char mcf=st.charAt(0);
	
	for(Character ch:map.keySet())
	{
		if(map.get(ch)> map.get(mcf))
		{
			mcf=ch;
		}
	}
	

System.out.println(mcf);
	
	
	}

}
