package InterviewQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PrintColorAndPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person();
		p1.setId(1);
		p1.setColorId(100);
		p1.setName("Pintu");
		Person p2=new Person();
		p2.setId(1);
		p2.setColorId(100);
		p2.setName("Pintu");
		Person p3=new Person();
		p3.setId(2);
		p3.setColorId(200);
		p3.setName("Ankit");
		List<Person> personlist=new ArrayList<>();
		personlist.add(p1);
		personlist.add(p2);
		personlist.add(p3);
		
		/*for(Person p:personlist){
			System.out.println(p.toString()+"lllllllllllll");
		}*/
		Color c1=new Color();
		c1.setId(100);
		c1.setName("Red");
		
		Color c2=new Color();
		c2.setId(200);
		c2.setName("Blue");
		
		List<Color> colorlist=new ArrayList<>();
		colorlist.add(c1);
		colorlist.add(c2);
		
		HashMap<String,Integer> hmap=new HashMap<>();
		HashMap<Integer,String> hmap1=new HashMap<>();
		
		for(Person p:personlist){
			if(!hmap.containsKey(p.getId())){
		//	System.out.println(p.toString());
				hmap.put(p.getName(), p.getColorId());
				hmap1.put(p.getColorId(), p.getName());
			}//else{
				
			//}
		}
		for(Entry<String, Integer> map: hmap.entrySet()){
			System.out.println(map.getKey()+ " "+map.getValue()+"000");
		}
		
		
		for(Entry<Integer, String> map: hmap1.entrySet()){
			System.out.println(map.getKey()+ " "+map.getValue()+"111");
		}
		
		for(Color c:colorlist){
			if(hmap.containsValue(c.id)){
			System.out.println(c.id);
			System.out.println(hmap1.get(c.id));
			}
		}
	}

	

}
