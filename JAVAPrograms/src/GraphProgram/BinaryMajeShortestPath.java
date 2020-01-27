package GraphProgram;

import java.util.LinkedList;
import java.util.Queue;

class BinaryMaze{
	
class Point{
	int xRow;
	int yRow;
	public Point(int xRow, int yRow) {
		super();
		this.xRow = xRow;
		this.yRow = yRow;
	}
	
}
class BinaryMazeQueue{
	
	Point p;
	int dist;
	
	
	public BinaryMazeQueue(Point p, int dist) {
		super();
		this.p = p;
		this.dist = dist;
	}
}

     int row[]={0,0,-1,1};
     int col[]={-1,1,0,0};

	public int shortestPath(Point src, Point dest,int Matrix[][]){
		
		Queue<BinaryMazeQueue> queue=new LinkedList<>();
		queue.add(new BinaryMazeQueue(src, 0));
		
		
		
		return 0;
		
	}
	
}


public class BinaryMajeShortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	}

}
