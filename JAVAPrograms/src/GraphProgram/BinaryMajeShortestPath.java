package GraphProgram;

import java.util.LinkedList;
import java.util.Queue;
class Point{
	int xRow;
	int yRow;
	public Point(int xRow, int yRow) {
		super();
		this.xRow = xRow;
		this.yRow = yRow;
	}
	
}
public class BinaryMajeShortestPath{
	
	static int ROW=9;
	static int COL=10;

    static int row[]={-1,0,0,1};
    static int col[]={0,-1,1,0};

static class QueueNode{
	
	Point point;
	int dist;
	
	
	public QueueNode(Point p, int dist) {
		super();
		this.point = p;
		this.dist = dist;
	}
}


	public static int shortestPath(Point src, Point dest,int matrix[][]){
		
		boolean visited[][] = new boolean[ROW][COL];
		
		if(matrix[src.xRow][src.yRow]!=1 && matrix[src.xRow][src.yRow]!=1){
			return -1;
		}
		System.out.println("111111111111111");
		
		Queue<QueueNode> queue=new LinkedList<>();
		QueueNode source=new QueueNode(src, 0);
		queue.add(source);
		visited[src.xRow][src.yRow]=true;
		
		System.out.println("2222222222222");	

		while(!queue.isEmpty()){
			QueueNode current= queue.peek();
			Point current_Point = current.point;
			
			if(current_Point.xRow==dest.xRow && current_Point.yRow == dest.yRow){
				return current.dist;
			}else{
				queue.remove();
			}
			for(int i=0;i<4;i++){
				int row1=current_Point.xRow + row[i];
				int col1=current_Point.yRow + col[i];
				if(valid_Point(row1,col1) && !visited[row1][col1] && matrix[row1][col1]==1){
					visited[row1][col1]=true;
					QueueNode adjecent_Point=new QueueNode(new Point(row1, col1),current.dist+1);
					queue.add(adjecent_Point);
					
				}
				
			}

		}
		
  System.out.println("2222222222222");	
		return -1;
		
	}

	private static boolean valid_Point(int row1, int col1) {
		// TODO Auto-generated method stub
		return (row1<ROW && row1>0) && (col1<COL && col1>0);
	}
	


//public class BinaryMajeShortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 }, 
                { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, 
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, 
                { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 }, 
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, 
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
                { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }}; 

		Point source = new Point(0, 0); 
		Point dest = new Point(3, 4); 

		int dist = shortestPath( source, dest, mat); 

		if (dist != Integer.MAX_VALUE) 
			System.out.println("Shortest Path is " + dist); 
		else
			System.out.println("Shortest Path doesn't exist"); 
 } 
	}


