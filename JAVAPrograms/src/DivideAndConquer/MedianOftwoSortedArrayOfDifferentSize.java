package DivideAndConquer;


/*
 This is an extension of the median of two sorted arrays of equal size problem. Here we handle arrays of unequal size also.

Examples:

Input : a[] ={1, 12, 15, 26, 38}
        b[] = {2, 13, 24}
Output : 14
Explanation : 
         After merging arrays the result is
         1, 2, 12, 13, 15, 24, 26, 38
         median = (13+15)/2 = 14.


The approach discussed in this post is similar to method 1 of equal size median.
 Use merge procedure of merge sort. Keep track of count while comparing elements of two arrays. 
 If count becomes ()(n1+n2)/2 (For n1+n2 elements), we have reached the median. 
Take the average of the elements at indexes ((n1+n2)/2)-1 and (n1+n2)/2 in the merged array. (for even length)
 */
public class MedianOftwoSortedArrayOfDifferentSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 1, 12, 15, 26, 38 }; 
		    int b[] = { 2, 13, 24 }; 
		  
		    int n1 = a.length;
		    int n2 = b.length;
		    
		    int median=getMedian(a, b, n1,n2);
		    System.out.println(median);
	}

	private static int getMedian(int[] a, int[] b, int n1, int n2) {
		// TODO Auto-generated method stub
		int indexA=0;int indexB=0;
		int median=-1; int prevMedian=-1;//(since length is odd so median would be (median+prevMedian)/2)
		
		for(int i=0;i<=(n1+n2)/2;i++){
			
			if(indexA<n1 && indexB<n2){
			if(a[indexA]<b[indexB]){
				prevMedian=median;
				median=a[indexA];
				indexA++;
			}
			else{
				prevMedian=median;
				median=b[indexB];
				indexB++;
			}
			}
			if(indexA==n1){   //means array a becomes empty or all element of array 1 is less than arrab (or smaller than 1st element of array B
				prevMedian=median;
				median=b[indexB];
				indexB++;
			}
			else 
				if(indexB==n2){   //means array b becomes empty or all element of array 2 is less than array 1 (or smaller than 1st element od array B
					prevMedian=median;
					median=a[indexA];
					indexA++;
				}
	}

		  if((n1+n2)%2==0){
			  return (median+prevMedian)/2;
		  }
		  else{
			  return median;
		  }
		
}
}

/*Output:
14.000000
Time Complexity: O(n)
*/