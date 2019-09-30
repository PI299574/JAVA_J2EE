package learnBay_DynemicProgramming;

//Dutch national flag problem
public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr={0,1,2,0,1};
		arr=sort012(arr,0,arr.length-1);
		arr=sort012Brute(arr,arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	private static int[] sort012Brute(int[] arr, int n) {
		// TODO Auto-generated method stub
		int count0=0,count1=0,count2=0;
		for(int i=0;i<=n;i++){
			if(arr[i]==0){
				count0++;
			}
			if(arr[i]==1){
				count1++;
			}
			if(arr[i]==2){
				count2++;
			}
			
		}
		System.out.println(count0+" ii"+count1+"ooo"+count2);
		int i;
		for(i=0;i<count0;i++){
			arr[i]=0;
		}
		for(i=count0;i<(count0+count1);i++){
			arr[i]=1;
		}
		for(i=(count0+count1);i<=n;i++){
			arr[i]=2;
		}
	
		return arr;
	}

	private static int[] sort012(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int mid=low;
		while(mid<=high){
			
				switch(arr[mid]){
				case 0:  	int temp=arr[mid];arr[mid]=arr[low];arr[low]=temp;
							mid++;low++;
							break;
				case 1:
							mid++;
							break;
							
				case 2:		int temp1=arr[mid];arr[mid]=arr[high];arr[high]=temp1;
							high--;
							break;
				}
			}
			return arr;
		}
		
	}


