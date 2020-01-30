package Implemenation;
/*
 /*Algorithm/Insights
For implementing an LRU cache, we can use a doubly linked list and a hash map.
Doubly Linked List - List of pages with most recently used page at the start of the list. So, as more pages are added to the list,
 least recently used pages are moved to the end of the list with page at tail being the least recently used page in the list.
Hash Map (key: page number, value: page) - For O(1) access to pages in cache

When a page is accessed, there can be 2 cases:
1. Page is present in the cache - If the page is already present in the cache, we move the page to the start of the list.
2. Page is not present in the cache - If the page is not present in the cache, we add the page to the list. 
How to add a page to the list:
   a. If the cache is not full, add the new page to the start of the list.
   b. If the cache is full, remove the last node of the linked list and move the new page to the start of the list.

Java code is provided in code snippet section.
Please refer to Algorithm Visualization section for understanding how the algorithm works for different test cases.
 */
import java.util.HashMap;
import java.util.Map;

class LRUCache{
	

static class Node{
	int key;
	int value;
	Node next;
	Node prev;
	public Node(int key, int value)
	{
		super();
		this.key = key;
		this.value = value;
		this.prev=null;
		this.next=null;
		
	}
	
}
	static int capcity;
	Node head=null;
	Node end=null;
	static Map<Integer,Node> map=new HashMap<>();
	public LRUCache(int capcity){
		LRUCache.capcity=capcity;
	}
	
	public int get(int key){
		
		if(map.containsKey(key))
		{
			Node current=map.get(key);
			int value=current.value;
			moveToFront(current);
			return value;
		}
		return -1;
	}
	
	public void put(int key, int value){
		Node new_node = new Node(key,value);
		if(map.containsKey(key))
		{
			Node current = map.get(key);
			current.value=value;
			moveToFront(current);
			return;
			
		}
		else
		{
	        if(this.capcity==map.size()){
	        	map.remove(end.key);
	        	removeNode(end);
	        }
	        addToFront(new_node);
	        map.put(key, new_node);
		}
		
	}

	private void moveToFront(Node current) {
		// TODO Auto-generated method stub
		addToFront(current);
		removeNode(current);
	}

	private void removeNode(Node current) {
		// TODO Auto-generated method stub
	
		if(current.next!=null){
			current.next.prev=current.prev;
		}else{
			end=current.prev;
		}
		
		
		if(current.prev!=null){
			current.prev.next=current.next;
		}else{
			head=current.next;
		}
		}

	private void addToFront(Node current) {
		// TODO Auto-generated method stub
		if(null==head){
			head=current;
		}
		head.prev = current;
		current.next=head;
		head=current;
		if(null==end){
			end=current;
		}
		

	}
}

public class LRUCacheImplemetation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache lrucache = new LRUCache(4);
		lrucache.put(1, 100);
		lrucache.put(10, 99);
		lrucache.put(15, 98);
		lrucache.put(10, 97);
		lrucache.put(12, 96);
		lrucache.put(18, 95);
		lrucache.put(1, 94);
 
		System.out.println(lrucache.get(1));  //94
		System.out.println(lrucache.get(10));  //97
		System.out.println(lrucache.get(15));  //-1
	}

}
