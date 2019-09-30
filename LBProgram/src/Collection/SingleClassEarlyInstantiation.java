package Collection;

public class SingleClassEarlyInstantiation {
	
	//Early, instance will be created at load time 
	private static SingleClassEarlyInstantiation singletonInstance=new SingleClassEarlyInstantiation();
	
	private SingleClassEarlyInstantiation(){
		// private constructor so that class
	    //cannot be instantiated from outside
	    //this class
		System.out.println("Object created");
	}
	
	public static SingleClassEarlyInstantiation getInstance(){
		return singletonInstance;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SingleClassEarlyInstantiation x=SingleClassEarlyInstantiation.getInstance();
		//SingleClassEarlyInstantiation y=SingleClassEarlyInstantiation.getInstance();
		
	}

}
