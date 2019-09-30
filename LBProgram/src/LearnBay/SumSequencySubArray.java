package LearnBay;

public class SumSequencySubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={1,4,5,2,3,7};
		int k=9;
		int sum=0;
		int j=0;
		for(int i=0;i<array.length;i++){
			System.out.println("sum" +sum);
			sum+=array[i];
			if(sum>k){
				sum=sum-array[j];
				j++;
			}
			if(sum==k){
				System.out.println("no"+ array[i] +" "+array[j]);
			}
		}
	}

}
