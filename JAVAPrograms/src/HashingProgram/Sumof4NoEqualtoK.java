package HashingProgram;

import java.util.HashMap;
import java.util.Map;

/*
 Given an array of integers, find any one combination of four elements in the array whose sum is equal to a given value X.

For example, if the given array is {10, 2, 3, 4, 5, 9, 7, 8} and X = 23, then your function should print “3 5 7 8” (3 + 5 + 7 + 8 = 23).
 Hashing Based Solution : O(n2Logn)

    Store sums of all pairs in a hash table
    Traverse through all pairs again and search for X – (current pair sum) in the hash table.
    If a pair is found with the required sum, then make sure that all elements are distinct array elements and 
    an element is not considered more than once.

 
 
 */
class Pair{
	int firstIndex;
	int seconIndex;
	int sum;
	public Pair(int firstIndex, int seconIndex) {
		super();
		this.firstIndex = firstIndex;
		this.seconIndex = seconIndex;
	}
	@Override
	public String toString() {
		return "Pair [firstIndex=" + firstIndex + ", seconIndex=" + seconIndex
				+ ", sum=" + sum + "]";
	}
	
	
	
}
public class Sumof4NoEqualtoK {

	static HashMap<Integer,Pair> hmap=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 1, 2}; 
	    int n = arr.length; 
	    int X = 91; 
	    findFourElements(arr, n, X); 
	}

	private static void findFourElements(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
	  
		for(int i=0;i<n-1;i++){
			for(int j=1;j<n;j++){
				int sum=arr[i]+arr[j];
				hmap.put(sum, new Pair(i,j));
			}
		}
		for(Map.Entry<Integer, Pair> m:hmap.entrySet()){
			//System.out.println("Sum "+m.getKey()+ " Pair index "+m.getValue().toString());
		}
		
		for(int i=0;i<n-1;i++){
			for(int j=1;j<n;j++){
				int sum=arr[i]+arr[j];
		if(hmap.containsKey(x-sum)){
			Pair pair=hmap.get(x-sum);
			if(pair.firstIndex!=i && pair.firstIndex!=j 
					&& pair.seconIndex!=i && pair.seconIndex!=j && pair.firstIndex!=pair.seconIndex && i!=j){
				System.out.println("Numbers are**** "+arr[i]+" "+ arr[j]+" "+arr[pair.firstIndex]+" "+arr[pair.seconIndex]);
				return;
			}
		}
		}
		}
			
	}

}
/*
 Time Complexity= n*nlogn
 */
