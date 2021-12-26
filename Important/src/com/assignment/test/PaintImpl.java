package com.assignment.test;

import java.util.Stack;

public class PaintImpl implements Paint{

	static int  paintScreen[][] = {
			{0,0,0,0,0,0,0},
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,1,0}
	};
	
	//Assuming old and New color is different
	//Assuming new Color as a random No since New Color is not given in method
	static int newColor;
	
	public static int getNewColor() {
		return newColor;
	}

	public static void setNewColor(int newColor) {
		PaintImpl.newColor = newColor;
	}

	@Override
	public void paintAll(int x, int y) {
		
		int oldColor = paintScreen[x][y];
		
		System.out.println("Old colour "+oldColor);
		
		Stack <Pixels> stack = new Stack<>();
		
		Pixels pixels=new Pixels(x, y);
		stack.push(pixels);
		
		
		while(!stack.isEmpty()) {
			
			Pixels temp = stack.pop();
			int temp_x=temp.getX(); //2
			int temp_y = temp.getY();//2
			
			if(temp_x<0 || temp_y<0 || temp_x > paintScreen.length-1 || temp_y > paintScreen[0].length-1) {
				continue;
			}
			
			if(paintScreen[temp_x][temp_y]!=oldColor) {
				continue;
			}
			
			if(isFilled(temp_x,temp_y))
			{
				continue;
			}
			
			fill(temp_x,temp_y);
			
			stack.push(new Pixels(temp_x+1, temp_y));
			stack.push(new Pixels(temp_x-1, temp_y));
			stack.push(new Pixels(temp_x, temp_y+1));
			stack.push(new Pixels(temp_x, temp_y-1));
			
		}
				
		
	}

	@Override
	public boolean isFilled(int x, int y) {
		
		int oldColor = paintScreen[x][y];

		return oldColor==newColor;
	}

	@Override
	public void fill(int x, int y) {
		
	
		int oldColor = paintScreen[x][y];
		
		if(!isFilled(x,y))
		paintScreen[x][y]=newColor;
		
		
		
	}
	 
	
	
	
	
	
	
	
	
	

}
