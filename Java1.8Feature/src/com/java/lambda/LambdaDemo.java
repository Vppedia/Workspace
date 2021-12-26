package com.java.lambda;

interface Sport
{
   public void play();	
}

class Cricket implements Sport
{

	@Override
	public void play() {
		System.out.println("I Love to Play Cricket");
		
	}
	

}
public class LambdaDemo {

	public static void main(String[] args) {
		//Normal implementation of interface
		Sport cricket = new Cricket();
		cricket.play();
		
		//Annonmous implentation of interface
		    Sport football = new Sport() {

				@Override
				public void play() {
					System.out.println("I Love to Play Football");
					
				}
		    	
		    	
		    };
		    football.play();
		    
	     Sport s=() ->{
				System.out.println("I Love to Play Chess");
				
			};
			s.play();
			
		

	}

}
