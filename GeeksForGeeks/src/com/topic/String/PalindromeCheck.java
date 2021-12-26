package com.topic.String;

public class PalindromeCheck {

	public static void main(String[] args) {

		String str = "geeks";
		boolean res = checkPalindrome(str);
		System.out.println(res);

	}
	
	public static boolean checkPalindrome(String s)
	{
		//Approach 1
//		StringBuffer sb = new StringBuffer(s);
//		StringBuffer reverse = sb.reverse();
//		return s.equals(reverse.toString());
		
		
		//Approach 2nd
		
		int begin=0;
		int end=s.length()-1;
		
		while(begin<end)
		{
			if(s.charAt(begin)!=s.charAt(end))
			{
				return false;
				
			}
				
			
			begin++;
			end--;
		}
		
		return true;
		
		
		
		
	}

}
