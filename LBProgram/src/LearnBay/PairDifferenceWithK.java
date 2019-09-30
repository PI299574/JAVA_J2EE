package LearnBay;

public class PairDifferenceWithK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[]=new int[]{1,2,3,4,6};
		int k=3;
		
		boolean hash[]=new boolean[999999];
		
		for(int i=0;i<arr.length;i++){
			hash[arr[i]]=true;
		}
		
		/*for(int i=0;i<hash.length;i++){
			System.out.println(hash[i]+" ");
		}*/
		
		for(int i=0;i<arr.length;++i){
			
		if(hash[(arr[i]+k)]==true && arr[i]+k<hash.length){
		
			System.out.println((arr[i])+ "  "+(arr[i]+k) );
			
		}
		else if(arr[i]-k>0 && hash[(arr[i]-k)]==true  ){
				
				System.out.println((arr[i])+ "  "+(arr[i]-k) );
				
	

		}
		
		
		}
		
		
		
		
		}
	}

