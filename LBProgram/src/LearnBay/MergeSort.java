package LearnBay;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={12,10,19,11,16,23};
	    int first=0,last=array.length-1;
		mergersort(array,first,last);
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]+" ");
	 
	}

	private static void mergersort(int[] array, int first, int last) {
		// TODO Auto-generated method stub
	
		
		if(first<last){
		int mid=(last +first)/2;
		mergersort(array,first,mid);
		mergersort(array,mid+1,last);
		merge(array,first,mid,last);
		
		}
	}

	private static void merge(int[] array, int first, int mid, int last) {
		// TODO Auto-generated method stub
		int n1=mid-first+1;
		int n2=last-mid;
		int array1[]=new int[n1];
		int array2[]=new int[n2];
		
		for(int i=0;i<n1;i++){
			array1[i]=array[first+i];
		}
		for(int i=0;i<n2;i++){
			array2[i]=array[mid+1+i];
		}
		int k=first;
		int i=0,j=0;
		int n=array.length;
		int mergeArray[]=new int[n];
		while(i<n1 && j<n2){
			
				if(array1[i]<=array2[j]){
					mergeArray[k]=array1[i];
					i++;j++;
				}
				else{
					mergeArray[k]=array2[j];
					i++;j++;
				}
					k++;
		}	
					
		//copy rememaining element of 1st array
		while(i<n1){
						mergeArray[k]=array1[i];
						i++;k++;
					}
		
		//copy rememaining element of 2nd array
					while(j<n2){
						mergeArray[k]=array2[j];
						j++;k++;
					}
		
		
	}

}
