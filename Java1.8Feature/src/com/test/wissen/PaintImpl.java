package com.test.wissen;

import java.util.Stack;


public class PaintImpl implements Paint {
	
	static int  paintScreen[][] = {
			{0,0,0,0,0,0,0},
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,1,0}
	};
	
	static int newColor;
	
	public static int getNewColor() {
		return newColor;
	}

	public static void setNewColor(int newColor) {
		PaintImpl.newColor = newColor;
	}

	@Override
	public void paintAll(int x, int y) {
		
	   int oldColor=paintScreen[x][y];
	   
	   Stack<Pixel> stack=new Stack<>();
	   
	   Pixel pixel=new Pixel(x,y);
	   
	   stack.push(pixel);
	   
	   while(!stack.isEmpty())
	   {
		   Pixel pop = stack.pop();
            int temp_X=pop.getX();
            int temp_Y=pop.getY();
            
            if(temp_X<0||temp_Y<0||temp_X>paintScreen.length-1||temp_Y>paintScreen[0].length-1)
            {
            	continue;
            	
            }
            
            if(paintScreen[temp_X][temp_Y]!=oldColor)
            {
            	continue;
            }
            
          if(isFilled(temp_X, temp_Y))
          {
        	  continue;
          }
          
      	fill(temp_X,temp_Y);
      	
      	stack.push(new Pixel(temp_X+1, temp_Y));//Insert Bottom Element to Stack
		stack.push(new Pixel(temp_X-1, temp_Y));//Insert top Element to Stack
		stack.push(new Pixel(temp_X, temp_Y+1));//Insert Right Element to Stack
		stack.push(new Pixel(temp_X, temp_Y-1));//Insert Left Element to Stack
            
	   
	   
	   
	   }
		
		
		
		
	}

	@Override
	public boolean isFilled(int x, int y) {
          
		int oldColor=paintScreen[x][y];
		
		return oldColor==newColor;
		
	}

	@Override
	public void fill(int x, int y) {
		
		int oldColor=paintScreen[x][y];
		
		paintScreen[x][y]=newColor;
		
		
	}
	

}
