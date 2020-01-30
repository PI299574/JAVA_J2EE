package Implemenation;

import java.util.Arrays;

class ArrayListCustom<E>{
	
	Object[] array;
	private static final int DEFAULT_CAPCITY =10;
	int size=0;
	public ArrayListCustom() {
		array=new Object[DEFAULT_CAPCITY];
	}
	
	public void add(E data){
		if(DEFAULT_CAPCITY==size){
			ensure_capcity();
		}
		array[size++]=data;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index){
		
		if(index < 0 || size < index){
			throw new ArrayIndexOutOfBoundsException("size="+index +"index="+index);
		}
		
		return (E) array[index];
		
	}
	
	public Object remove(int index){
		if(index < 0 || size < index){
			throw new ArrayIndexOutOfBoundsException("size="+index +"index="+index);
		}
		Object remove_element=array[index];
		for(int i=index;i<size;i++){
			array[i]=array[i+1];
		}
		size--; //removed element so reduce the size by 1
		return remove_element;
	}
	private void ensure_capcity() {
		// TODO Auto-generated method stub
		int doble_the_size=2*DEFAULT_CAPCITY;
		Arrays.copyOf(array, doble_the_size);
	}
	
	public void display(){
		for(int i=0;i<size;i++){
			System.out.print(array[i]+" ");
		}
	}
	
}


public class ArrayListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();
        //Add elements in custom ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);

        //Display custom ArrayList
        list.display();
        System.out.println("\nelement at index in custom ArrayList > " + 1 + " = " + list.get(1));

        //Remove element from custom ArrayList
        System.out.println("element removed from index " + 1 + " = "
                     + list.remove(1));

        //Again display custom ArrayList
        System.out
                .println("\nlet's display custom ArrayList again after removal at index 1");

        list.display();

        // list.remove(11); //will throw IndexOutOfBoundsException, because
                     // there is no element to remove on index 11.
        // list.get(11); //will throw IndexOutOfBoundsException, because there
                     // is no element to get on index 11.
	}

}
