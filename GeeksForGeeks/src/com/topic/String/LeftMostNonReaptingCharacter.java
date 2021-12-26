package com.topic.String;

public class LeftMostNonReaptingCharacter {

	public static void main(String[] args) {
		
		String str="geeksforgeeks";
		
		   int res = leftMostNonRepeatingCharacter(str);
		   
		   System.out.println(res);

	}
	
	public static int leftMostNonRepeatingCharacter(String s)
	{
//		for(int i=0;i<s.length();i++)
//		{
//			int flag=0;
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(s.charAt(i)==s.charAt(j))
//					flag=1;
//			}
//			if(flag==0)
//				return i;
//		}
//		
		
		char[] ch = new char[256];

		for (int i = 0; i < s.length(); i++) {
			ch[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (ch[s.charAt(i)] ==1) {

				return i;
			}
		}
		
		
		
		return -1;
		
	}

}
