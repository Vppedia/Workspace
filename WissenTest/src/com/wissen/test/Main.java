package com.wissen.test;

public class Main {
	
	public static void main(String[] args)
	{
		PaintImp imp=new PaintImp();
		
		System.out.println("Origin Print Screen");
		printScreen(PaintImp.paintScreen);
		
		imp.setNewColor(5);
		
		imp.paintAll(2, 2);
		
		
		System.out.println("updated Print Screen");
		printScreen(PaintImp.paintScreen);
		  
		
		
		
		
	}
	
	public static void printScreen(int screen[][])
	{
		for(int i=0;i<screen.length;i++)
		{
			for(int j=0;j<screen[0].length;j++)
			{
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
		
	}
	
	

}
