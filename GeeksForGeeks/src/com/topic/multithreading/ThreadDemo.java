package com.topic.multithreading;

class Medical extends Thread
{
	
	public void run()
	{  
		try {

			System.out.println("Medical starts");
			Thread.sleep(5000);
			System.out.println("Medical completes");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}
class TestDrive extends Thread
{
	
	public void run()
	{  
		try {
			
			
				
				System.out.println("TestDrive starts");
				Thread.sleep(5000);
				System.out.println("TestDrive completes");
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}

class OfficerSignature extends Thread
{
	
	public void run()
	{  
		try {
			
			 
				
				System.out.println("Officer starts reading the files");
				Thread.sleep(5000);
				System.out.println("signature done");
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}

public class ThreadDemo {

	
	public static void main(String[] args) throws InterruptedException
	{

		   Medical vivek=new Medical();
	       
	        vivek.start();
	        vivek.join();
	        TestDrive o=new TestDrive();
	       
	        o.start();
	        
	        o.join();
	        
	       OfficerSignature os=new OfficerSignature();
	       
	       os.start();
	        
	}
}
