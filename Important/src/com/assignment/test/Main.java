package com.assignment.test;

public class Main {

	public static void main(String[] args) {

		
	    //Creating an Object of an PaintImpl class
		Paint paintTest = new PaintImpl();
		
		
		System.out.println("before Paining");
		printPaintScreen(PaintImpl.paintScreen);
		
		PaintImpl.setNewColor(8);  //Set New Color => as Number
		
		paintTest.paintAll(2,2);
		
		System.out.println("After painting ");
		printPaintScreen(PaintImpl.paintScreen);
		
		
		
		
	}

	
	
	 //Print Paint Screen
	private static void printPaintScreen(int[][] paintScreen) {

		for(int i=0;i<paintScreen.length;i++) {
			
			for(int j=0;j<paintScreen[0].length;j++) {
				System.out.print(paintScreen[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
