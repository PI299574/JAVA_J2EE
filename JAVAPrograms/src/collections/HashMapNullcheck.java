package collections;

import java.util.HashMap;



public class HashMapNullcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Integer, String> hmap = new HashMap<>();
      hmap.put(1,null);
      hmap.put(2, null);
      System.out.println(hmap.get(3));
      System.out.println(hmap.get(1));
      
	}

}
