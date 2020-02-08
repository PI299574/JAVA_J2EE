package RecursionProblem;
/*
 
Flood fill Algorithm – how to implement fill() in paint?

In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced with a new selected color.
 Following is the problem statement to do this task.
Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all adjacent same colored pixels
 with the given color.

Example:

Input:
       screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 2, 2, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 2, 2, 0},
                      {1, 1, 1, 1, 1, 2, 1, 1},
                      {1, 1, 1, 1, 1, 2, 2, 1},
                      };
    x = 4, y = 4, newColor = 3
The values in the given 2D screen indicate colors of the pixels.
x and y are coordinates of the brush, newColor is the color that
should replace the previous color on screen[x][y] and all surrounding
pixels with same color.

Output:
Screen should be changed to following.
       screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 3, 3, 3, 3, 0, 1, 0},
                      {1, 1, 1, 3, 3, 0, 1, 0},
                      {1, 1, 1, 3, 3, 3, 3, 0},
                      {1, 1, 1, 1, 1, 3, 1, 1},
                      {1, 1, 1, 1, 1, 3, 3, 1},
                      };

 */
public class FloodFillAlgorithm {
	static int m=8,n=8;
	static int ROW[]={1,0,-1,0};
	static int COL[]={0,1,0,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
                };
		
		int x=4; int y=4;int newcolor=3;
		floodFill(x,y,newcolor,screen);
		System.out.println("Updated screen after call to floodFill: "); 
	    for (int i = 0; i < m; i++) 
	    { 
	        for (int j = 0; j < n; j++) 
	        System.out.print(screen[i][j] + " "); 
	        System.out.println(); 
	    } 
	}

	private static void floodFill(int x, int y, int newcolor, int[][] screen) {
		// TODO Auto-generated method stub
		int oldcolor=screen[x][y];
		floodFillRecursive(oldcolor,newcolor,x,y,screen);
	}

	private static void floodFillRecursive(int oldcolor, int newcolor, int x,
			int y, int[][] screen) {
		// TODO Auto-generated method stub
		
		if(x>=m || x<0 || y>=n || y<0){
			return;
		}
		if(screen[x][y]!=oldcolor){
			return;
		}
		screen[x][y]=newcolor;
				
		
		/*floodFillRecursive(oldcolor,newcolor,x+1,y,screen);
		floodFillRecursive(oldcolor,newcolor,x-1,y,screen);
		floodFillRecursive(oldcolor,newcolor,x,y+1,screen);
		floodFillRecursive(oldcolor,newcolor,x,y-1,screen);*/
		for(int i=0;i<4;i++){
			floodFillRecursive(oldcolor,newcolor,x+ROW[i],y+COL[i],screen);
		}
		
	}

}
