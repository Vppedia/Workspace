package com.topic.multithreading;


class Party extends Thread
{
	
     public void run()
     {
    	try {
    		 
    		 System.out.println(Thread.currentThread().getName()+" Enjoying party ");
    		 Thread.sleep(2000);
    		 
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	 
     }

}

class Travelling implements Runnable
{
	
     public void run()
     {
    	try {
    		 
    		 System.out.println(Thread.currentThread().getName()+" Enjoying travelling ");
    		 Thread.sleep(2000);
    		 
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	 
     }

}

class Investing implements Runnable
{
	
     public void run()
     {
    	try {
    		 
    		 System.out.println(Thread.currentThread().getName()+" Enjoying Investing ");
    		 Thread.sleep(2000);
    		 
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	 
     }

}


public class ThreadCreating {

	
	
	public static void main(String[] args) {
		
		Party vivek=new Party();
		 vivek.setName("Vivek");
		 vivek.start();
		
		Travelling t=new Travelling();
		Thread suraj=new Thread(t);
		suraj.setName("suraj");
		suraj.start();
		
		Investing tt=new Investing();
		Thread vijay=new Thread(tt);
		vijay.setName("vijay");
		vijay.setPriority(10);
		vijay.start();
		

	}

}
