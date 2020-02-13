package Implemenation;
/*
 HashSet internally implements HashMap. 
 */

class HashSetCustome<E>{
	HashMap<E,Object> hashMapCustom ;
	int size;
	public HashSetCustome(int size){
		this.size=size;
		hashMapCustom=new HashMap(this.size);
	}
	
	public void add(E data){
		hashMapCustom.put(data, null);
	}
	
	public boolean contains(E key){
		if(key!=null){
			if(hashMapCustom.contains(key)!=null){
			  return true;
			}
			}
	return false;
	}
	
	public boolean remove(E key){
		return hashMapCustom.remove(key);
	}
	
	public void display(){
		hashMapCustom.display();
	}
}

public class HashSetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSetCustome<Integer> hashSetCustom = new HashSetCustome<Integer>(16);
	       hashSetCustom.add(21);
	       hashSetCustom.add(25);
	       hashSetCustom.add(30);
	       hashSetCustom.add(33);
	       hashSetCustom.add(35);
	           
	       System.out.println("HashSetCustom contains 21 ="+hashSetCustom.contains(21));
	       System.out.println("HashSetCustom contains 51 ="+hashSetCustom.contains(51));
	           
	       System.out.print("Displaying HashSetCustom: ");
	       hashSetCustom.display();
	       
	       System.out.println("\n\n21 removed: "+ hashSetCustom.remove(21));
	       System.out.println("22 removed: "+ hashSetCustom.remove(22));
	           
	       System.out.print("Displaying HashSetCustom: ");
	       hashSetCustom.display();
	}

}
