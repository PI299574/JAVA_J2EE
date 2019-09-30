package stackProgram;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsuing2Queue<T>{

	Queue<T> queue1=new LinkedList<T>();
	Queue<T> queue2=new LinkedList<T>();
	
	public void push(T data){
		if(queue1.isEmpty()){
			queue1.offer(data);
		}else{
			while(!queue1.isEmpty()){
				queue2.offer(queue1.poll());
			}
			queue1.offer(data);
		}
		if(!queue2.isEmpty()){
			while(!queue2.isEmpty()){
			queue1.offer(queue2.poll());
			}
		}
		System.out.println("Size of q1 = "+queue1.size());
		System.out.println("Size of q2 = "+queue2.size());
	}
	
	public T pop(){
		T data=null;
		if(!queue1.isEmpty()){
			data=queue1.poll();
		}
		return data;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsuing2Queue<Integer> stack=new StackUsuing2Queue<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
