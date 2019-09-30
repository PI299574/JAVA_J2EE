package LearnBay;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array[]={34,3,21,12,89,76};
		int low=0, high =array.length-1;
		QuickSort quick=new QuickSort();
		quick.sort(array, low, high);
		
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]+" ");
		
	}

	public void sort(int[] array, int low, int high) {
		// TODO Auto-generated method stub
	if(low<high){
	int pivot=getPivot(array,low,high);
	sort(array,low,pivot-1);
	sort(array,pivot+1,high);
	}
	}

	public int getPivot(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int i=low-1,j=0;
		int pivot=array[high];
		for(int k=low;k<high;k++){
			
			if(array[k]<=pivot){
				i++;
				
				int temp=array[i];
				array[i]=array[k];
				array[k]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return i+1;
	}

}
