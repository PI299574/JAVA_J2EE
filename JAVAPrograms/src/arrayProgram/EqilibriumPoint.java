package arrayProgram;

/*Input : A[] = {-7, 1, 5, 2, -4, 3, 0}
Output : 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2]  =  A[4] + A[5] + A[6]*/
public class EqilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //int arr[]={-7, 1, 5, 2, -4, 3, 0};
      int arr[]={1, 3, 5, 2, 2};
      int n=arr.length;
      int eQpoint=getEqillibriumIndex(arr,n);
      System.out.println("Equillibrium Index is "+eQpoint);
      
      int eQPoint1=getEqillibriumIndex1(arr, n);
      System.out.println("Equillibrium Index is " + eQPoint1);
	}

	private static int getEqillibriumIndex1(int[] arr, int n) {
		// TODO Auto-generated method stub
		int totalSum=0, leftsum=0,rightsum=0;int index=-1;
		for(int i=0;i<n;i++){
			totalSum=totalSum+arr[i];
		}
		System.out.println("Totsl Sum is "+totalSum);
		for(int i=0;i<n;i++){
			totalSum=totalSum-arr[i];
			
System.out.println("*****************Rightsum***"+totalSum);
System.out.println("*****************Leftsum***"+leftsum);
			if(leftsum==totalSum){
				index= i;
			}
			leftsum=leftsum+arr[i];
		}
		return index;
	}

	private static int getEqillibriumIndex(int[] arr, int n) {
		// TODO Auto-generated method stub
		int leftSum=0,rightSum=0;
		int index=0;
		
			for(int j=0,k=n-1;j<k;j++,k--){
				leftSum=leftSum+arr[j];
				rightSum=rightSum+arr[k];
				
				if(leftSum==rightSum){
					index= j+1;
				}
			}
		
		return index;
		
	}

}
