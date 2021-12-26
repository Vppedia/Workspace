package com.topic.String;

public class StringDemo {

	public static void main(String[] args) {
		
     String s1="Hello";
     String s2="Hello";
     String s3=new String("Hello");
    
     //Equals and == parameter check in String
     
     //use case of ==
     System.out.println(s1==s2);
     System.out.println(s1==s3);
     System.out.println(s2==s3);
     
     System.out.println("-----------------------------------");
     
    //Use case for  equals
     System.out.println(s1.equals(s2));
     System.out.println(s1.equals(s3));
     System.out.println(s2.equals(s3));
     
     
     System.out.println("-----------------------------------");
     
    //String Function
     
     String str="HelloWorld";
   
     for(int i=0;i<str.length();i++)
     { 
    	 System.out.println(i+" "+str.charAt(i));
     }
     
     System.out.println("-----------------------------------");
     
     //String substring
     System.out.println(str.substring(0, 5));
     
     System.out.println("-----------------------------------");
     
    String str1="IAHelloworld";
    String[] split = str1.split("A");
    
    for(String s:split)
    {
    	System.out.println(s);
    }
     
    System.out.println("-----------------------------------");
     String s4="India";
     for(int i=0;i<s4.length()-1;i++)
     {
    	 for(int j=i+1;j<=s4.length();j++)
    	 {
    		 System.out.println(s4.substring(i,j));
    	 }
     }
    
     
}

}
