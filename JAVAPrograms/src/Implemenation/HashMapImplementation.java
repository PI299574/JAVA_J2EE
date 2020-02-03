package Implemenation;



class HashMap<K, V>{
	
	static class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}	
	}
	Entry<K,V>[] table;
	int size;
	public HashMap(int size) {
		this.size = size;
		this.table = new Entry[size];
	}
	
	
	public void put(K newKey,V value){
		
		int hashKey = hash(newKey);
		Entry<K,V> new_entry=new Entry(newKey, value, null);
		if(null==table[hashKey]){
			table[hashKey]=new_entry;
		}
		Entry<K,V> current=table[hashKey];
		Entry<K,V>  prev = null;
		while(current!=null){
			if(newKey.equals(current.key)){
				current.value=value;
				return;
			}
			prev=current;
			current=current.next;
		}
		prev.next=new_entry;
	}

	
	public V get(K key){
		
		if(null==key){
			return null;
		}
		int hash_key = hash(key);
		if(table[hash_key]==null){
			return null;
		}
		Entry<K,V> current = table[hash_key];
		while(current!=null){
			if(key.equals(current.key)){
				return current.value;
			}
			current=current.next;
		}
		return null;
		
	}

	public boolean remove(K key){
		if(key==null){
		return false;
		}
		int hashKey=hash(key);
		Entry<K,V> current= table[hashKey];
	    if(current==null){
	    	return false;
	    }
		Entry<K,V>  prev = null;
		while(current!=null){
			
			if(key.equals(current.key)){
				if(prev==null){
					table[hashKey]=table[hashKey].next;
					return true;
				}else{
				prev.next=current.next;
				return true;
			}
			}
			prev=current;
			current=current.next;
		}
		return false;
		
	}
	
	private int hash(K newKey) {
		// TODO Auto-generated method stub
		return Math.abs(newKey.hashCode()%16);
	}
	public void display(){
		for(int i=0;i<size;i++){
			Entry<K,V> current=table[i];
			while(current!=null){
			System.out.println(current.key +" "+current.value);
			current=current.next;
			}
		}
	}
	
}


public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(16);
		map.put(1,2);
		System.out.println("**** "+map.get(1));
		map.put(1, 3);
		map.put(21, 51);
		map.put(11, 41);
		map.put(31, 61);
		map.put(15, 45);
		map.put(25, 55);
		map.display();
		System.out.println("**GET*** "+map.get(15));
		System.out.println("**GET*** "+map.get(12));
		System.out.println("**REMOVE*** "+map.remove(15));
		map.display();
	}

}
