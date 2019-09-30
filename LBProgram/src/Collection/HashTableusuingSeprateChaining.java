package Collection;

class HashNode {
	String key;
	String value;
	HashNode next;

	HashNode(String k, String v) {
		key = k;
		value = v;
		next = null;
	}

	// HashNode head;
}

class hashTable {

	public int size;
	public HashNode table[];
	public int tableSize;

	public hashTable(int tableSize) {
		this.tableSize = tableSize;
		size = 0;
		table = new HashNode[tableSize];
		for (int i = 0; i < tableSize; i++) {
			table[i] = null;
		}
	}

	public String get(String key) {

		int index = getIndex(key);

		if (table[index] == null) {
			return null;
		} else {
			HashNode entry = table[index];
			while (entry != null && !entry.key.equals(key)) {
				entry = entry.next;
			}
			if (entry == null) {
				return null;
			}
			return entry.value;
		}
	}

	public void insert(String key, String value) {

		int index = getIndex(key);
		HashNode hashNodeEntry = new HashNode(key, value);

		if (table[index] == null) {
			table[index] = hashNodeEntry;
			hashNodeEntry.next = null;
			size++;
			return;
		} else {
			HashNode entry = table[index];
			while (entry.next != null && !entry.key.equals(key)) {
				entry = entry.next;
			}
			if (entry.key.equals(key)) {
				entry.value = value;
			}
			entry.next = hashNodeEntry;
			hashNodeEntry.next = null;
			size++;
			return;
		}

	}

	public void remove(String key) {
		int index = getIndex(key);
		HashNode entry = table[index];
		HashNode prevEntry = null;
		if (entry != null) {

			while (entry.next != null && !entry.key.equals(key)) {
				prevEntry = entry;
				entry = entry.next;
			}

			if (entry.key.equals(key)) {

				if (prevEntry == null) {
					table[index] = entry.next;
				} else {
					prevEntry.next = entry.next;
				}

				size--;
			}

		}

	}

	public int getIndex(String key) {
		int hashVal = ((key.hashCode()) % tableSize);
	/*	if (hashVal < 0)
			hashVal += tableSize;*/
		return hashVal;
	}

	public void printTable() {

		for (int i = 0; i < tableSize; i++) {
			HashNode entry = table[i];

			if (entry != null) {
				System.out.println(entry.key + " " + entry.value);
				entry = entry.next;
			}
		}

	}

}

public class HashTableusuingSeprateChaining {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashTableusuingSeprateChaining htsc = new
		// HashTableusuingSeprateChaining();

		hashTable hashtable = new hashTable(10);

		hashtable.insert("1", "Apple");
		hashtable.insert("1", "papya");
		hashtable.insert("2", "boy");
		hashtable.insert("3", "cat");
		hashtable.printTable();
		System.out.println(hashtable.get("1"));
		//hashtable.remove("3");
		System.out.println("after remove");
		hashtable.printTable();
		
	}

}
