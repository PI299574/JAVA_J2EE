package DivideAndConquer;
/*
Input arr[] = {3, 4, 5, 1, 2}
Element to Search = 1
  1) Find out pivot point and divide the array in two
      sub-arrays. (pivot = 2) /*Index of 5
  2) Now call binary search for one of the two sub-arrays.
      (a) If element is greater than 0th element then
             search in left array
      (b) Else Search in right array
          (1 will go in else as 1 < 0th element(3))
  3) If element is found in selected sub-array then return index
     Else return -1.
 */

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Let us search 3 in below array 
	      // int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
	       //int arr1[] = {3, 4, 5, 1, 2};
		int arr1[]={8,9,2,3,4};
		int key=9;
	       int n = arr1.length; 
	       //int key = 6; 
	       System.out.println("Index of the element is : "
	                      + pivotedBinarySearch(arr1, n-1, key)); 
	}

	private static int pivotedBinarySearch(int[] arr1, int n, int key) {
		// TODO Auto-generated method stub
		
		int pivotIndex=getIndexOfPivotElement(arr1,0,n-1);
		System.out.println("Pivot element "+pivotIndex);
		if(pivotIndex==-1){
			return Binarysearch(arr1,0,n-1,key);
		}
	      if(arr1[pivotIndex]==key){
	    	  return pivotIndex;
	      }
			if(arr1[0]<=key){
			return Binarysearch(arr1,0,pivotIndex-1,key);
			}
			return Binarysearch(arr1, pivotIndex+1, n-1, key);
	}

	private static int getIndexOfPivotElement(int[] arr1, int start, int end) {
		// TODO Auto-generated method stub
		 if(start>end){
	            return -1;
	        }
		 if(start==end){
	            return start;
	        }
		int mid=start+(end-start)/2;

		if(arr1[mid]>arr1[mid+1]){
			return mid;
		}
		else{
			if(arr1[start]<=arr1[mid]){
				return getIndexOfPivotElement(arr1,mid+1,end);
			}else{
				return getIndexOfPivotElement(arr1,start,mid-1);
			}
		}
	}
	private static int Binarysearch(int[] arr1, int start, int end, int key) {
		
		if (end < start || arr1.length<=0) 
	           {return -1;} 
        System.out.println("end "+end);
        System.out.println("start "+start);
		if(end>=start){	
		int mid= start+(end-start)/2;
		if(arr1[mid]==key){
			return mid;
		}
		if(arr1[mid]>key){
			return Binarysearch(arr1,start,mid-1,key);
		}
		return Binarysearch(arr1,mid+1,end,key);
		}
		return -1;
		
		// TODO Auto-generated method stub
		
	}

}
