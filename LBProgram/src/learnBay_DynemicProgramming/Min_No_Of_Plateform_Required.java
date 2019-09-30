package learnBay_DynemicProgramming;

import java.util.Arrays;

/*Input:  arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
There are at-most three trains at a time (time between 11:00 to 11:20)

* arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
    dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

All events sorted by time.
Total platforms at any time can be obtained by subtracting total 
departures from total arrivals by that time.
 Time     Event Type     Total Platforms Needed at this Time                               
 9:00       Arrival                  1
 9:10       Departure                0
 9:40       Arrival                  1
 9:50       Arrival                  2
 11:00      Arrival                  3 
 11:20      Departure                2
 11:30      Departure                1
 12:00      Departure                0
 15:00      Arrival                  1
 18:00      Arrival                  2 
 19:00      Departure                1
 20:00      Departure                0

Minimum Platforms needed on railway station = Maximum platforms 
                                              needed at any time 
                                           = 3  
*/

public class Min_No_Of_Plateform_Required {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]  = {900,  940, 950,  1100, 1500, 1800};
        int dep[]  = {910, 1200, 1120, 1130, 1900, 2000};

		int plateform=findMinNoOfPlateformRequired(arr,dep);
		System.out.println(" No of plateform required is "+plateform);
		
		//int plateform1=findMinNoOfPlateformRequired_AnotherApproach(arr,dep);
		//System.out.println("************* No of plateform required is "+plateform1);
	}



	private static int findMinNoOfPlateformRequired(int[] arr, int[] dep) {
		// TODO Auto-generated method stub
		int pltfrm_rqrd=0;
		int maxValue_of_pltfrm_rqrd=0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int arr_index = 0,dep_index = 0;
		while(arr_index<arr.length && dep_index<dep.length){
			if(arr[arr_index]<dep[dep_index]){
				arr_index++;
				pltfrm_rqrd++;
			}else{
				dep_index++;
				pltfrm_rqrd--;
			}
			if(maxValue_of_pltfrm_rqrd<pltfrm_rqrd){
				maxValue_of_pltfrm_rqrd=pltfrm_rqrd;	
			}
		}
		
		return maxValue_of_pltfrm_rqrd;
	}

}
