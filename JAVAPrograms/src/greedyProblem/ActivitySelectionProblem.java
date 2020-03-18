package greedyProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Example:

Example 1 : Consider the following 3 activities sorted by
by finish time.
     start[]  =  {10, 12, 20};
     finish[] =  {20, 25, 30};
A person can perform at most two activities. The 
maximum set of activities that can be executed 
is {0, 2} [ These are indexes in start[] and 
finish[] ]

Example 2 : Consider the following 6 activities 
sorted by by finish time.
     start[]  =  {1, 3, 0, 5, 8, 5};
     finish[] =  {2, 4, 6, 7, 9, 9};
A person can perform at most four activities. The 
maximum set of activities that can be executed 
is {0, 1, 3, 4} [ These are indexes in start[] and 
finish[] ]



The greedy choice is to always pick the next activity whose finish time is least among the remaining activities and the 
start time is more than or equal to the finish time of previously selected activity. We can sort the activities according
 to their finishing time so that we always consider the next activity as minimum finishing time activity.

1) Sort the activities according to their finishing time
2) Select the first activity from the sorted array and print it.
3) Do following for remaining activities in the sorted array.
…….a) If the start time of this activity is greater than or equal to the finish time of previously selected activity then
 select this activity and print it.
 */

class Activity{
	int startTime;
	int finishTime;
	public Activity(int startTime, int finishTime) {
		super();
		this.startTime = startTime;
		this.finishTime = finishTime;
	}
	
}
public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity a1=new Activity(1,2);
		Activity a2=new Activity(3,4);
		Activity a3=new Activity(0,6);
		Activity a4=new Activity(5,7);
		Activity a5=new Activity(8,9);
		Activity a6=new Activity(5,9);
		List<Activity> list =new ArrayList<>();
		list.add(a1);list.add(a2);list.add(a3);list.add(a4);list.add(a5);list.add(a6);
		Collections.sort(list, (a,b)->a.finishTime-b.finishTime);
		
		PrintActivity(list);
		
		
	}

	private static void PrintActivity(List<Activity> list) {
		// TODO Auto-generated method stub
		int startTime=list.get(0).startTime;
		int finishTime= list.get(0).finishTime;
		int k=0;
		System.out.println(startTime +" "+finishTime);
		for(int i=1;i<list.size();i++){
			if(list.get(i).startTime>list.get(k).finishTime){
				System.out.println(list.get(i).startTime+" "+list.get(i).finishTime);
				k=i; //update i as last selected activity
			}
			
			
		}
	}

}
/*
Q2 :

Find maximum meetings in one room


There is one meeting room in a firm. 
There are N meetings in the form of (S[i], F[i]) where S[i] is the start time of meeting i and F[i] is finish time of meeting i. 
The task is to find the maximum number of meetings that can be accommodated in the meeting room. Print all meeting numbers

Examples:

    Input : s[] = {1, 3, 0, 5, 8, 5}, f[] = {2, 4, 6, 7, 9, 9}
    Output : 1 2 4 5
    First meeting [1, 2]
    Second meeting [3, 4]
    Fourth meeting [5, 7]
    Fivth meeting [8, 9]
    
    Idea: Use same approcah as discussed above
*/