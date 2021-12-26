package com.wissen.test;

import java.util.Stack;





public class PaintImp{
	
	public static int paintScreen[][]= 
		 {
				 {1,1,1,1,1},
				 {1,1,1,1,1},
				 {1,0,0,0,1},
				 {1,0,0,0,1},
				 {1,1,1,1,1}
			 
			 
	    };
	
	
	  private int newColor;
	  
	  


	
	public int getNewColor() {
		return newColor;
	}



	public void setNewColor(int newColor) {
		this.newColor = newColor;
	}



	public void paintAll(int x, int y) {
		
		int oldColor = paintScreen[x][y];
		
		Stack <Pixels> stack = new Stack<>();
		
		Pixels pixels=new Pixels(x, y);
		stack.push(pixels);
		
		
		while(!stack.isEmpty()) {
			
			Pixels temp = stack.pop();
			int temp_x=temp.getX(); 
			int temp_y = temp.getY();
			
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



	public boolean isFilled(int x, int y) {
		
		return false;
	}


	
	public void fill(int x, int y) {
		
		
	}
	  
	

	
	
	

}
