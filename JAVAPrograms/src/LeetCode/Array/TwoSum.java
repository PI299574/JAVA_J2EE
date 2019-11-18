package LeetCode.Array;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result[]=new int[2];
		int nums[]={3,2,3};
		int target=6;
		twoSum(nums,target);

	}
	public static int[] twoSum(int[] nums, int target) {
		int result[]=new int[2];
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<=nums.length-1;j++){
				System.out.println(i+" "+j);
				if(nums[i]+nums[j]==target){
					result[0]=i;result[1]=j;
				}
			}
		}
		System.out.println(result[0]);
		System.out.println(result[1]);
		return result;
	}
}
