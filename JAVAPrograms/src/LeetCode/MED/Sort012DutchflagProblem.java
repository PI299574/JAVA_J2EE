package LeetCode.MED;
/*Dutch flag algorithm
 * Input :  {0, 1, 2, 0, 1, 2}
Output : {0, 0, 1, 1, 2, 2}

Input :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output : {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}*/


/*	steps: https://coderbyte.com/algorithm/dutch-national-flag-sorting-problem
		1. create 2 pointer low and high point to first and last elemnt.
		2. create a mid pointer , point to first elemnt.
		3. if arr[mid] == 2...swap(arr[mid],arr[high])...decrement high--.
		4. if arr[mid] == 0 ...swap(arr[mid],arr[low])...increment mid++, low++;
		5. if arr[mid] == 1 ...do nothing...just increment mid++;
*/
public class Sort012DutchflagProblem {
	
	    public void sortColors(int[] nums) {
	        
	        int low=0;
	        int mid=0;
	        int high=nums.length-1;
	        while(mid<=high){
	            if(nums[mid]==0){
	               int tmp=nums[low];
	                nums[low]=nums[mid];
	                nums[mid]=tmp;
	                mid++;
	                low++;
	            }
	            else if(nums[mid]==1){
	                mid++;
	            }
	            else if(nums[mid]==2){
	                int tmp=nums[mid];
	                nums[mid]=nums[high];
	                nums[high]=tmp;
	                high--;
	            }
	        }
	        
	    }
	}

