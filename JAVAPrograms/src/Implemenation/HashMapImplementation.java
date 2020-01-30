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

	private int hash(K newKey) {
		// TODO Auto-generated method stub
		return Math.abs(newKey.hashCode()%16);
	}
	
	
}


public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
