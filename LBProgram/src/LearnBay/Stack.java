package LearnBay;

public class Stack {
	
	public int top;
	
        public Stack()
        {top=-1;}

        int max=1000;
        int []stack=new int[max];
        
        public boolean push(int d){
        	if(top>=max-1){
        		System.out.println("overflow");
        	return false;
        	}
        	else{
        		stack[++top]=d;
        		return true;
        	}
        }
        
        
        
        public int pop(){
        	if(top<1){
        		System.out.println("underflow");
        		return 0;
        	}
        	else{
        		int d=stack[top--];
        		return d;
        	}
        	
        }
        
        public int peek(){
        	return stack[top];
        }
        
        public int size(){
        
        	return top;
        }
       public boolean isEmpty()
        {
        	if(top<0)
        		return true;
			return false;
            
        }
        public static void main(String[] args) {
		// TODO Auto-generated method stub
        		Stack stack=new Stack();
        		stack.push(24);
        		stack.push(75);
        		stack.push(1);
        		stack.push(10);
        		stack.push(67);
        		stack.push(34);
        		stack.push(23);
        		stack.push('c');
        		
        		System.out.println(stack.pop());
        		//stack.display();
        		System.out.println("Size " +stack.size());
	}

		private void display() {
			// TODO Auto-generated method stub
			for(int i=top;i>=0;i--){
				System.out.println(stack[top--] +" ");
			}
		}
}