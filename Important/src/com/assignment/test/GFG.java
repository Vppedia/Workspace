package com.assignment.test;

class GFG
{

static void floodFill(int screen[][], int row, int col,
                                    int prevC, int newC)
{
   
    if (row< 0 || row >= screen.length || col < 0 || col >= screen[0].length)
        return;
    
    if (screen[row][col] != prevC)
        return;
 
    // Replace the color at (x, y)
    screen[row][col] = newC;
 
    // Recur for north, east, south and west
    floodFill(screen, row+1, col, prevC, newC);
    floodFill(screen, row-1, col, prevC, newC);
    floodFill(screen, row, col+1, prevC, newC);
    floodFill(screen, row, col-1, prevC, newC);
}
 
public static void main(String[] args)
{
    int screen[][] = 
    	            {{1, 1, 1, 1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1, 1, 0, 0},
                    {1, 0, 0, 1, 1, 0, 1, 1},
                    {1, 2, 2, 2, 2, 0, 1, 0},
                    {1, 1, 1, 2, 2, 0, 1, 0},
                    {1, 1, 1, 2, 2, 2, 2, 0},
                    {1, 1, 1, 1, 1, 2, 1, 1},
                    {1, 1, 1, 1, 1, 2, 2, 1},
                    };

    
    System.out.println("Screen Before call to floodFill: ");
    
    for (int i = 0; i <screen.length; i++)
    {
        for (int j = 0; j<screen[0].length; j++)
        System.out.print(screen[i][j] + " ");
        System.out.println();
    }
    
    
    int row = 4, col = 4, newC = 5;
    int prevC = screen[row][col];
    floodFill(screen, row, col,prevC, newC);
 
    
    System.out.println("Updated screen after call to floodFill: ");
    for (int i = 0; i <screen.length; i++)
    {
        for (int j = 0; j<screen[0].length; j++)
        System.out.print(screen[i][j] + " ");
        System.out.println();
    }
    
    
    
    }
}