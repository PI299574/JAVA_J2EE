package LearnBay;

public class Stackchar {
	
	public int top;
	
        public Stackchar()
        {top=-1;}

        int max=1000;
        char []stack=new char[max];
        
        public boolean push(char d){
        	if(top>=max-1){
        		System.out.println("overflow");
        	return false;
        	}
        	else{
        		stack[++top]=d;
        		return true;
        	}
        }
        
        
        
        public char pop(){
        	if(top<1){
        		System.out.println("underflow");
        		return 0;
        	}
        	else{
        		char d=stack[top--];
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
        		Stackchar stack=new Stackchar();
        		
        		stack.push('c');
        		stack.push('d');
        		stack.push('e');
        		stack.push('f');
        		System.out.println(stack.pop());
        		//stack.push('f');
        		stack.display();
        	//	System.out.println("Size " +stack.size());
	}

		private void display() {
			// TODO Auto-generated method stub
			for(int i=top;i>=0;i--){
				System.out.println(stack[top--] +" ");
			}
		}
}