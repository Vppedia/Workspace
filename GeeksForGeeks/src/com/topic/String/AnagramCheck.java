package com.topic.String;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {

       String s1="silent";
       String s2="listen";
       
       boolean checkAnagram = checkAnagram(s1,s2);
       System.out.println(checkAnagram);

	}
	
	
	public static boolean checkAnagram(String s1,String s2)
	{
//		if (s1.length() != s2.length())
//			return false;
//
//		char[] charArray1 = s1.toCharArray();
//		char[] charArray2 = s2.toCharArray();
//
//		Arrays.sort(charArray1);
//		Arrays.sort(charArray2);
//
//		String coms1 = new String(charArray1);
//		String coms2 = new String(charArray2);
//
//		return coms1.equals(coms2);
		
		
		
		if(s1.length()!=s2.length())
			return false;
		
		char ch[]=new char[256];
		
		for(int i=0;i<s1.length();i++)
		{
			ch[s1.charAt(i)]++;
			ch[s2.charAt(i)]--;
			
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=0)
			{
				return false;
			}
		}
		
		
		return true;
	}

}
