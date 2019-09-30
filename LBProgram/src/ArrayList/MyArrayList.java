package ArrayList;
public class MyArrayList {

	private static final int SIZE_FACTOR=5;
	
	private Object array[];
	
	private int index;
	
	private int size;
	
	public MyArrayList(){
		this.array=new Object[SIZE_FACTOR];
		this.size=SIZE_FACTOR;
	}
	
	public void add(Object obj){
		System.out.println("index:"+this.index+"size:"+this.size+"array size:"+this.array.length);
		if(this.index==this.size-1){
			//we need to increase the size of array[]
			increaseSizeAndReallocate();
		}
		array[this.index]=obj;
		this.index++;
		
	}
	
	private void increaseSizeAndReallocate() {
		this.size=this.size+SIZE_FACTOR;
		Object newarray[]=new Object[this.size];
		for(int i=0; i<array.length;i++){
			newarray[i]=array[i];
		}
		this.array=newarray;
		System.out.println("***index:"+this.index+"size:"+this.size+"array size:"+this.array.length);
	}
	
	public Object get(int i) throws Exception{
		if(i>this.index-1){
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i<0){
			throw new Exception("Negative Value");
		}
		return this.array[i];
		
	}
	
	public void remove(int i) throws Exception{
		if(i>this.index-1){
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i<0){
			throw new Exception("Negative Value");
		}
		System.out.println("Object getting removed:"+this.array[i]);
		for(int x=i; x<this.array.length-1;x++){
			array[x]=array[x+1];
		}
		this.index--;
	}

	public static void main(String[] args) throws Exception {
		MyArrayList mal = new MyArrayList();
		mal.add("0");
		mal.add("1");
		mal.add("2");
		mal.add("3");
		mal.add("4");
		mal.add("5");
		mal.add("6");
		mal.add("7");
		mal.add("8");
		mal.add("9");
		
		mal.remove(5);
		System.out.println(mal.get(7));
	}

}