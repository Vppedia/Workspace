package com.test.wissen;

public class Practice {
	
	
	public static void paintAll(int screen[][],int row,int col,int prevC,int newC)
	{
		
		if(row<0||row>=screen.length||col<0||col>=screen[0].length)
		{
			return;
		}
		
		if(screen[row][col]!=prevC)
			return;
		
		screen[row][col]=newC;
		
		paintAll(screen,row+1,col,prevC,newC);
		paintAll(screen,row-1,col,prevC,newC);
		paintAll(screen,row,col+1,prevC,newC);
		paintAll(screen,row,col-1,prevC,newC);
		
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
	    int paintScreen [][]={
	    				{0,0,0,0,0,0,0},
	    				{0,1,1,1,1,1,0},
	    				{0,1,0,0,0,1,0},
	    				{0,1,0,0,0,1,0},
	    				{0,1,1,1,1,1,0}
	    		};
	    
	   
	 
	    System.out.println("Original Screen !!!");
	    
	    
	    for(int i=0;i<paintScreen.length;i++)
	    {
	    	for(int j=0;j<paintScreen[0].length;j++)
	    	{
	    		System.out.print(paintScreen[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	  
	    int row=0,col=0, newC=5;
	    int prevC=paintScreen[row][col];
	    
	    
	    paintAll(paintScreen,row,col,prevC,newC);
	    
     System.out.println("Updated Screen !!!");
	    
	    
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
