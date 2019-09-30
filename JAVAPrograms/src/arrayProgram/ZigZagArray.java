package arrayProgram;
/*Example: 
Input:  arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: arr[] = {3, 7, 4, 8, 2, 6, 1}

Input:  arr[] =  {1, 4, 3, 2}
Output: arr[] =  {1, 4, 2, 3}*/
public class ZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  arr[] = {4, 3, 7, 8, 6, 2, 1};
	    arr=zigZagarray(arr,true);
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");
		 }
	}

	private static int[] zigZagarray(int[] arr, boolean flag) {
		// TODO Auto-generated method stub
		
		
			for(int i=1;i<arr.length-1;i++){
				if(flag){    // '>'
					if(arr[i]>arr[i+1]){
						int tmp=arr[i];arr[i]=arr[i+1];arr[i+1]=tmp;
					}
			}
				else{
					if(arr[i]<arr[i+1]){
						int tmp=arr[i];arr[i]=arr[i+1];arr[i+1]=tmp;
					}
				
				}
				flag=!flag;
			
		}
			
			return arr;
	}

}
