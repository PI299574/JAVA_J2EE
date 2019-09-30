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
      
      arr=dutchFlagSort(arr);
      for(int i=0;i<arr.length;i++){
    	  System.out.print(arr[i]+" ");
      }
      
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
