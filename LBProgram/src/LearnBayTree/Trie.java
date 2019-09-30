package LearnBayTree;

class TrieNode{
	
	private static final int ALPHABATE_SIZE = 26;
	TrieNode []children=new TrieNode[ALPHABATE_SIZE];
	boolean isLeaf;
	char data;
	public TrieNode(){
		for(int i=0;i<ALPHABATE_SIZE;i++){
			children[i]=null;
		}
		
		isLeaf=false;
	}
	public TrieNode(char c){
		
		for(int i=0;i<ALPHABATE_SIZE;i++){
			children[i]=null;
		}
		this.data=c;
		isLeaf=false;
	}
	
}


public class Trie {
	
	TrieNode root=new TrieNode();
	private TrieNode insert(String s) {
		// TODO Auto-generated method stub
		int length=s.length();
		s=s.toLowerCase();
		TrieNode current=root;
		int	index;
		for(int i=0;i<length;i++){
			index =s.charAt(i)-'a';
			//System.out.println(index);
			if(current.children[index]==null){
				current.children[index]=new TrieNode(s.charAt(i));
			}
			current=current.children[index];
		}
		current.isLeaf=true;
		return current;
	}
	private boolean search(String s) {
		// TODO Auto-generated method stub
		int length=s.length();
		s=s.toLowerCase();
		int index=0;
		TrieNode current=root;
		for(int i=0;i<length;i++){
			index=s.charAt(i)-'a';
			if(current.children[index]==null){
				return false;
			}
			current=current.children[index];
		}
		return current.isLeaf ;
	}
	public static void main(String[] args) {
		
		
		Trie tree=new Trie();
		TrieNode m=tree.insert("AMIT");
		System.out.println(m.isLeaf);
		tree.insert("Amita");
		tree.insert("Pintu");
		tree.insert("Himdeep");
		boolean f=tree.search("Pint");
		System.out.println("Present ? "+f);
	}

	

	

	
	
	
}

