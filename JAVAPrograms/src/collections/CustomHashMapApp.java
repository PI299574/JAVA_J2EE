package collections;
class CustomhashMap<K,V>{

	class Entry<K,V>{
		K key;
		V value;
		Entry next;
		public Entry(K key, V value, Entry next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	Entry<K,V> []table;
	int size=4;
	public CustomhashMap() {
		super();
		this.table = new Entry[size];
	}


	public void put(K newKey, V newValue){
		if(null==newKey){
			return ;
		}
		int hash=hash(newKey);
		Entry newEntry=new Entry(newKey, newValue, null);
		Entry<K,V> current =table[hash];

		Entry <K,V> prev =null;
		//2 case :either current )hashed bucket locaton is null or not null
		if(null==current){
			table[hash]=newEntry;
		}else{
			//reach till the end and liked the new entry
			while(null!=current){
				//if key is already present in hashmap then 2 way to : either replace existing entry value woth nevalue
				//or delete the new entry and put add the new entry
				if(current.key.equals(newKey)){
					current.value=newValue;
					return;
				}

				prev=current;
				current=current.next;
			}
			prev.next=newEntry;
		}


	}

	public V get(K newKey){

		if(null==newKey){
			return null;
		}
		int hash=hash(newKey);
		//2 case either the hased uket location is null or not null
		if(null==table[hash]){
			return null;
		}
		else{
			//not null then check if buket entry key and key is equal or not
			Entry<K,V> current=table[hash];
			while(null!=current){
				if(current.key.equals(newKey)){
					return current.value;
				}
				current=current.next;
			}
		}


		return null;

	}

	public boolean remove(K deleteKey){

		if(null==deleteKey){
			return false;
		}

		int hash = hash(deleteKey);
		if(null==table[hash]){
			return false;
		}
		else{
			Entry<K,V> prev =null;
			Entry<K,V> current=table[hash];
			while(null!=current){
				if(current.key.equals(deleteKey)){
					//2 case either 1st entry contain key or in between/last entry contain key
					if(null==prev){
						table[hash]=table[hash].next;
						return true;
					}else{
						prev.next=current.next;
						return true;
					}
				}
				prev=current;
				current=current.next;
			}
		}

		return false;

	}

	public void display(){

		for(int i=0;i<size;i++){
			Entry<K,V> current=table[i];
			while(null!=current){
				System.out.println(current.key +" "+current.value+" ");
				current=current.next;
			}

		}
	}

	private int hash(K newKey) {
		// TODO Auto-generated method stub
		return Math.abs(newKey.hashCode()%size);
	}
}


public class CustomHashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomhashMap<Integer,Integer> map=new CustomhashMap();
		map.put(1,2);
		//System.out.println("**** "+map.get(1));
		map.put(1, 3);
		map.put(21, 51);
		map.put(11, 41);
		map.put(31, 61);
		map.put(15, 45);
		map.put(25, 55);
		map.display();
		System.out.println("**GET*** "+map.get(25));
		System.out.println("**GET*** "+map.get(12));
		System.out.println("**REMOVE*** "+map.remove(23));
		map.display();
	}
}
