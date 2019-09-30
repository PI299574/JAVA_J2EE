package LearnBay;

public class CelebrityProblem {

	
	public static int matrix[][]=
		     {
		     {0,0,0,1,0},
			 {0,0,0,1,0},
			 {0,0,0,1,0},
			 {0,0,0,1,0},
			 {0,0,0,1,0}
			 };
	
	/*public static int matrix[][]=
	     {
	     {0,0,0,1},
		 {0,0,0,1},
		 {0,0,0,1},
		 {0,0,0,1}
		
		 };*/
	/*public static int matrix[][]=
	     {
	     {0,0,0,0},
		 {0,0,0,0},
		 {0,0,0,0},
		 {0,0,0,0}
		
		 };*/
	
	/*public static int matrix[][]=
	     {
	     {0,1,0,0},
		 {0,1,0,0},
		 {0,1,0,0},
		 {0,1,0,0}
		
		 };*/
	/*public static int matrix[][]=
	     {
	     {0,0,1,0},
		 {0,0,1,0},
		 {0,0,1,0},
		 {0,0,1,0}
		
		 };*/
	
	public static int knows(int a, int b){
		return matrix[a][b];
	}
	
	public static int findCelebrity(int n){
		Stack st=new Stack();
		for(int i=0;i<n;i++){
			st.push(i);
		}
		
		int c = -1;
		int d=0;
		while(!st.isEmpty()){
			
			int a=st.pop();
			int b=st.pop();
			
			if(knows(a,b)==1){
				st.push(b);
				d=1;
			}
			else{
				st.push(a);
				d=1;
			}		
		}
		c=st.pop();

		
		if(d==0){
			c=-1;
		}
		
		return c;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		int res=findCelebrity(n);
		if(res!=-1)
		System.out.println(res);
		else{
			System.out.println("No celeb");
		}
		
	}

}
