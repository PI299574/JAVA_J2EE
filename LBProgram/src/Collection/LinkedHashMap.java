package Collection;

public class LinkedHashMap<K, V> {

	public Entry<K, V> table[];
	public int capcity = 10;
	public Entry<K, V> head;
	public Entry<K, V> last;

	public LinkedHashMap() {
		table = new Entry[capcity];
	}

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		Entry<K, V> before, after;

		public Entry(K key, V value, Entry<K, V> next) {

			this.key = key;
			this.value = value;
			this.next = next;

		}

	}

	public int hash(K key) {
		return key.hashCode() % capcity;
	}

	public V get(K key) {

		int index = hash(key);
		if (table[index] == null) {
			return null;
		} else {
			Entry<K, V> entry = table[index];
			while (entry.next != null) {
				if (entry.key.equals(key)) {
					return entry.value;
				}
				entry = entry.next;
			}
		}

		return null;

	}
	public void put(K key,V value){
		
		if(key==null){
			return;
		}
		Entry new_entry=new Entry<K, V>(key, value, null);
		int index=hash(key);
		maintainInsertionOrderAfterInsert(new_entry);
		if(table[index]==null){
			table[index]=new_entry;
			
		}
		else{
			Entry current=table[index];
			Entry previous=null;
			while(current!=null ){
				
				
				previous=current;
				current=current.next;
			}
			//previous.next=new_entry;
			if(current.key.equals(key)){
				if(previous==null){
					table[index]=new_entry;
					new_entry.next=current.next;
					return;
				}
				else{
					previous.next=new_entry;
					new_entry.next=current.next;
					return;
				}
			}
			
			
		}
		
	}

 
	private void maintainInsertionOrderAfterInsert(Entry new_entry) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
