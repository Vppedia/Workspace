package com.topic.multithreading;

class BookMovieTicket
{
   int total_seat=10;
   
   public synchronized void bookSeat(int n)
   {
	   if(total_seat>=n)
	   {
		   System.out.println("Ticket Book Successfully!!!");
		   total_seat=total_seat-n;
		   
		   System.out.println("Available Seat "+total_seat);
	   }
	   else
	   {
		   System.out.println("Seat cannot be booked");
		   System.out.println("Seat left "+total_seat);
	   }
   }


}

class MovieBookApp extends Thread
{
   public static  BookMovieTicket b = new BookMovieTicket();
     int seats;
    public void run()
    {
    	b.bookSeat(seats);
    }

}



public class SynchronizationDemo {
	
	public static void main(String[] args)
	{
		MovieBookApp vivek=new MovieBookApp();
		vivek.seats=7;
		vivek.start();
		MovieBookApp suraj=new MovieBookApp();
		suraj.seats=7;
		suraj.start();

	}

}
