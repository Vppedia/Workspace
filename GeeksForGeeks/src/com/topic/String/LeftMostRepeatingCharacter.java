package com.topic.String;

public class LeftMostRepeatingCharacter {

	public static void main(String[] args) {

		String str = "abbcd";

		int res = leftMostCharacter(str);
		System.out.println(res);
	}
	public static int leftMostCharacter(String s)
	{
		//Approach 1
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (s.charAt(i) == s.charAt(j))
//					return i;
//			}
//		}
//		return -1;
		
		
		//Approach 2nd
		
		char [] ch=new char[256];
		
		for(int i=0;i<s.length();i++)
		{
			ch[s.charAt(i)]++;
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(ch[s.charAt(i)]>1)
			{
				
				return i;
			}
		}
		
		return -1;
		
	}

}
