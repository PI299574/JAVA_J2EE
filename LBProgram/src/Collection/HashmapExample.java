package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hmap=new HashMap<>();
		hmap.put(1, "A");
		hmap.put(2, "C");
		hmap.put(3, "D");
	    hmap.put(1, "F");
	    hmap.put(3, "F");
	
	    for(Map.Entry<Integer, String> m: hmap.entrySet()){
		System.out.println("key "+ m.getKey());
		System.out.println("value "+ m.getValue());
	}
	}
}
