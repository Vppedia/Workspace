package com.test.wissen;

public class Mian {
	
	public static void  main(String[] args)
	{
		PaintImpl pImpl=new PaintImpl();
		System.out.println("Original Paint Screen");
        
		printPaintScreen(PaintImpl.paintScreen);
		
		PaintImpl.setNewColor(7);
		pImpl.paintAll(2,2);
		
         System.out.println("Painted Screen");
        
		printPaintScreen(PaintImpl.paintScreen);
		

		
		
	}
	
	
	public static void printPaintScreen(int paintScreen[][])
	{
		for(int i=0;i<paintScreen.length;i++)
		{
			for(int j=0;j<paintScreen[0].length;j++)
			{
				System.out.print(paintScreen[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}
	
	
	
	

}
