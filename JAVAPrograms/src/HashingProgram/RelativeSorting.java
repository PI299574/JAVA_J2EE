package HashingProgram;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

/*
Given two arrays A1[] and A2[], sort A1 in such a way that the relative order among the elements will be same as those are in A2. 
For the elements not present in A2, append them at last in sorted order.
Example:

 Input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
       A2[] = {2, 1, 8, 3}
Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}

The code should handle all cases like the number of elements in A2[] may be more or less compared to A1[].
 A2[] may have some elements which may not be there in A1[] and vice versa is also possible.
 
 
 
    Loop through A1[], store the count of every number in a HashMap (key: number, value: count of number)
    Loop through A2[], check if it is present in HashMap, if so, put in output array that many times and remove the number from HashMap.
    Sort the rest of the numbers present in HashMap and put in output array.

 
 
 */
public class RelativeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
	    int A2[] = {2, 1, 8, 3};
		
	    int result[] =new int[A1.length]; 
	    //step 1: count frequency of all element in A1 in hashmap
	    
	    HashMap<Integer, Integer> hmap= new HashMap<>();
	    for(int i=0;i<A1.length;i++){
	    	if(hmap.containsKey(A1[i])){
	    		hmap.put(A1[i],hmap.get(A1[i])+1);
	    	}
	    	else{
	    		hmap.put(A1[i], 1);
	    	}
	    }
	    
	    //Step 2: Iterate through a2 , If a2 is present in map ..print the elemesnt of a2 as per frequency time and remoce from map.
	    int index=0;
	    for(int i=0;i<A2.length;i++){
	    	if(hmap.containsKey(A2[i])){
	    		int freq=hmap.get(A2[i]);
	    		while(freq>0){
	    		result[index++]=A2[i];
	    		freq--;
	    		}
	    	}
	    	hmap.remove(A2[i]);
	    }
	    
	    //Sort the rest key element of map. 
	    for(Map.Entry<Integer, Integer> m:hmap.entrySet()){
	    	System.out.println(m.getKey()+" "+m.getValue());
	    }
	    
	    LinkedList<Entry<Integer,Integer>> list=new LinkedList<>(hmap.entrySet());
	    
	    Collections.sort(list,new Comparator<Entry<Integer,Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey()-o2.getKey();
			}
	    	
	    });
	    
	    Map <Integer,Integer> lmap=new LinkedHashMap<>();
	    for(Map.Entry<Integer, Integer> m: list){
	    	lmap.put(m.getKey(), m.getValue());
	    }
	    
	    // store the rest key in result array
	     
	 for(Integer key: lmap.keySet()){
	    	result[index++]=key;
	    }
	    
	    //Print the output result
	
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}

}
