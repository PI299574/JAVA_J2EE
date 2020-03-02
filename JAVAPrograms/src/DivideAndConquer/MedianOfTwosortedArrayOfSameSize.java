package DivideAndConquer;
/*
 
Median of two sorted arrays of same size

There are 2 sorted arrays A and B of size n each. Write an algorithm to find the median of 
the array obtained after merging the above 2 arrays(i.e. array of length 2n). The complexity should be O(log(n)).  


Simple : use merge sort .
keep track of smalleset element and it's prev element .
Use merge procedure of merge sort. Keep track of count while comparing elements of two arrays. If count becomes n(For 2n elements),
we have reached the median. Take the average of the elements at indexes n-1 and n in the merged array
 */
public class MedianOfTwosortedArrayOfSameSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ar1[] = {1, 12, 15, 26, 38}; 
	        int ar2[] = {2, 13, 17, 30, 45}; 
	        
	
	       
	        int n1 = ar1.length; 
	        int n2 = ar2.length; 
	        if (n1 == n2) 
	            System.out.println("Median is " + 
	                        getMedian(ar1, ar2, n1)); 
	        else
	            System.out.println("arrays are of unequal size"); 
	}

	private static int getMedian(int[] ar1, int[] ar2, int n) {
		// TODO Auto-generated method stub
		
		int indexA=0;int indexB=0;
		int median=-1; int prevMedian=-1;//(since length is odd so median would be (median+prevMedian)/2)
		
		for(int i=0;i<=n;i++){
			
			
			if(ar1[indexA]<ar2[indexB]){
				prevMedian=median;
				median=ar1[indexA];
				indexA++;
			}
			else {
				prevMedian=median;
				median=ar2[indexB];
				indexB++;
			}
			
			if(indexA==n){  //means all element of ArrayA is less than arrB(or 1st element of B)
				prevMedian=median;
				median=ar2[0];
				break;
				
			}
			else if(indexB==n){  //means all element of ArrayA is less than arrB(or 1st element of B)
				prevMedian=median;
				median=ar1[0];
				break;
				
			}
		}
		
		
		return (median+prevMedian)/2;
	}

}
/*Output :
Median is 16
Time Complexity : O(n)
     */