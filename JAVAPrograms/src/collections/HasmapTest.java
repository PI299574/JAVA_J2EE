package collections;

import java.util.HashMap;
import java.util.Map;

public class HasmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Integer> hmap=new HashMap<>();
		hmap.put(1, 1);
		hmap.put(2, 2);
		hmap.put(1, 3);
		for(Map.Entry<Integer, Integer> map:hmap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue()+" ");
		}
	}

}
