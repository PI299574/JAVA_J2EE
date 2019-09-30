package GraphProgram;

import java.util.LinkedList;
import java.util.Queue;

/*
Shortest distance between two cells in a matrix or grid

Given a matrix of N*M order. Find the shortest distance from a source cell to a destination cell,
traversing through limited cells only. Also you can move only up, down, left and right. If found output the distance else -1.
s represents ‘source’
d represents ‘destination’
 * represents cell you can travel
0 represents cell you can not travel
This problem is meant for single source and destination.

Examples:

Input : {'0', '*', '0', 's'},
        {'*', '0', '*', '*'},
        {'0', '*', '*', '*'},
        {'d', '*', '*', '*'}
Output : 6

Input :  {'0', '*', '0', 's'},
         {'*', '0', '*', '*'},
         {'0', '*', '*', '*'},
         {'d', '0', '0', '0'}
Output :  -1

The idea is to BFS (breadth first search) on matrix cells. Note that we can always use BFS to find shortest path if graph is unweighted.

    Store each cell as a node with their row, column values and distance from source cell.
    Start BFS with source cell.
    Make a visited array with all having “false” values except ‘0’cells which are assigned “true” values as they can not be traversed.
    Keep updating distance from source value in each move.
    Return distance when destination is met, else return -1 (no path exists in between source and destination).
 */

class GetMinDistance{

	int row=4;
	int col=4;

	class QueueItem{
		int XRow;
		int YCol;
		int dist;
		public QueueItem(int xRow, int yCol, int dist) {
			super();
			this.XRow = xRow;
			this.YCol = yCol;
			this.dist = dist;
		}
	}
	public int getSourcePositionInMatrix(char[][] matrix) {
		// TODO Auto-generated method stub
		boolean visited[][]=new boolean[4][4];
		boolean flag=false;
		int i=0,j = 0;
		for(i=0;i<matrix.length;i++){
			for(j=0;j<matrix[i].length;j++){
				if(matrix[i][j]=='s'){
					flag=true;
					visited[i][j]=false;
					break;
				}
				if(matrix[i][j]=='*'){
					visited[i][j]=false;
				}
				if(matrix[i][j]=='0'){
					visited[i][j]=true;
				}
			}
			if(flag){
				break;
			}
		}
		System.out.println("Source Row " +i);
		System.out.println("Source Column " +j);
		QueueItem source=new QueueItem(i,j, 0);
		return getMinDistSouceToDist(source,matrix,visited);
	}
	private int getMinDistSouceToDist(QueueItem source, char[][] matrix, boolean[][] visited) {
		// TODO Auto-generated method stub

		Queue<QueueItem> queue=new LinkedList<>();
		queue.add(source);
		while(!queue.isEmpty()){

			QueueItem current=queue.poll();
			System.out.println("current row>>>>>"+current.XRow);
			System.out.println("current col>>>>>"+current.YCol);
			System.out.println("Row>>>>>>>>>"+row);
			System.out.println("Col>>>>>>>>>"+col);
			if(matrix[current.XRow][current.YCol]=='d'){
				return current.dist;
			}

			//left move(Col is changing)
			if(current.YCol >=0 && visited[current.XRow][current.YCol-1]==false){
				queue.add(new QueueItem(current.XRow, current.YCol, current.dist+1));
				visited[current.XRow][current.YCol-1]=true;
			}
			//right move(Col is changing)
			if( current.YCol < col && visited[current.XRow][current.YCol+1]==false){
				queue.add(new QueueItem(current.XRow, current.YCol, current.dist+1));
				visited[current.XRow][current.YCol+1]=true;
			}
			//up move (row is changing)
			if( current.XRow >=0 && visited[current.XRow-1][current.YCol]==false){
				queue.add(new QueueItem(current.XRow, current.YCol, current.dist+1));
				visited[current.XRow][current.YCol]=true;
			}
			//down move
			if( current.XRow <row && visited[current.XRow+1][current.YCol]==false){
				queue.add(new QueueItem(current.XRow, current.YCol, current.dist+1));
				visited[current.XRow+1][current.YCol]=true;
			}
		}





		return -1;
	}
}
public class ShortestDistanceBetweenTwoCellsInMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMinDistance minDistinstace=new GetMinDistance();
		char [][]matrix={	{'0', '*', '0', 's'},
				{'*', '0', '*', '*'},
				{'0', '*', '*', '*'},
				{'d', '*', '*', '*'}};
		//System.out.println(matrix.length);
		//System.out.println(matr);
		int min_dist=minDistinstace.getSourcePositionInMatrix(matrix);
		System.out.println("Min distance is "+min_dist);
	}





}
