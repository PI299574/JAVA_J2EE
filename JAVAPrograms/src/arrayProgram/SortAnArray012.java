package arrayProgram;

/*Dutch flag algorithm
 * Input :  {0, 1, 2, 0, 1, 2}
Output : {0, 0, 1, 1, 2, 2}

Input :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output : {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}*/
public class SortAnArray012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
      
      //arr=dutchFlagSort(arr);
      arr=dutchFlagSortMySolution(arr);
      for(int i=0;i<arr.length;i++){
    	  System.out.print(arr[i]+" ");
      }
      
	}

	private static int[] dutchFlagSortMySolution(int[] arr) {
		// TODO Auto-generated method stub
		
		
	/*	steps: https://coderbyte.com/algorithm/dutch-national-flag-sorting-problem
			1. create 2 pointer low and high point to first and last elemnt.
			2. create a mid pointer , point to first elemnt.
			3. if arr[mid] == 2...swap(arr[mid],arr[high])...decrement high--.
			4. if arr[mid] == 0 ...swap(arr[mid],arr[low])...increment mid++, low++;
			5. if arr[mid] == 1 ...do nothing...just increment mid++;
	*/
		
		int low=0;int high=arr.length-1;
		int mid=0;
		while(mid<=high){
		if(arr[mid]==2){
			int temp= arr[mid];
			arr[mid] =arr[high];
			arr[high] = temp;
			high--;
		}
		else if(arr[mid]==0){
			int temp= arr[mid];
			arr[mid] =arr[low];
			arr[low] = temp;
			low++;mid++;
		}
		else if(arr[mid]==1){
			mid++;
		}
		}
		return arr;
	}

	private static int[] dutchFlagSort(int[] arr) {
		// TODO Auto-generated method stub
		int beg=0,end=arr.length-1;
		//int mid=(beg+end)/2;
		int mid=0;
		while(mid<=end){
			switch(arr[mid]){
			case 0:
				int tmp=arr[beg];
				arr[beg++]=arr[mid];
				arr[mid++]=tmp;
				break;
			
			case 1:
		        mid++;
		        break;
			case 2:
				int temp=arr[mid];
				arr[mid]=arr[end];
				arr[end--]=temp;
				break;
				
		}
		}
		return arr;
	}

}
