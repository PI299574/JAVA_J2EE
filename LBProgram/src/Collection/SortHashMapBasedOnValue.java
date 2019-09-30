package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapBasedOnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> hmap=new HashMap<>();
		hmap.put(1, "A");
		hmap.put(2, "C");
		hmap.put(3, "D");
	    hmap.put(1, "F");
	    hmap.put(3, "F");
	    
	    LinkedList<Map.Entry<Integer,String>> list=new LinkedList<>(hmap.entrySet());
	    Collections.sort(list,new MyComparator());
	    LinkedHashMap<Integer,String > lhmap=new LinkedHashMap<>();
	    
	  

        for(Map.Entry<Integer,String > e:list){

               lhmap.put(e.getKey(), e.getValue());

        }

        
        System.out.println("After sorting ");

        for(Map.Entry<Integer,String> m:lhmap.entrySet()){

               System.out.println(m.getKey() +" "+m.getValue());

        }
	}

}

class MyComparator implements Comparator<Entry<Integer,String>>{
	
	public int compare(Entry<Integer, String> e1,Entry<Integer, String> e2){
		return e1.getValue().compareTo(e2.getValue());
	}
	
}