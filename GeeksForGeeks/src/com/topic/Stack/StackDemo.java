package com.topic.Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		String st= "(a+b)+(c+d)";
		Stack<Character>s=new Stack<>();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			
			if(ch==')')
			{
				
		         if(s.peek()=='(')
		         {
		        	 System.out.println(true);
		        	 return;
		         }
		         else
		         {
		        	 while(s.peek()!='(')
		        	 {
		        		 s.pop();
		        	 }
		        	 s.pop();
		         }
				
				
			}
			else {
				
				 s.push(ch);
			}
			
			
		}
		System.out.println(false);
		
		
	}

}
