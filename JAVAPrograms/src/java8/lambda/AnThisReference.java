package java8.lambda;


public class AnThisReference {

	public void doProcess(int a, Process p){
		p.process(a);
	}

	public void execute(){
		doProcess(10,i->{
			System.out.println("value i"+i);
			System.out.println("This reference "+this);
		});

	}
	@Override
	public String toString(){
		return "an thisreference Object";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnThisReference thisEx=new AnThisReference();
		/*thisEx.doProcess(10, new Process(){

			@Override
			public void process(int a) {
				// TODO Auto-generated method stub
				System.out.println("this refrence "+this);  //here this pointing to annonymous class reference.
			}

			@Override
			public String toString(){
				return "an Process";
			}
		});
		 */

		/*thisEx.doProcess(10,i->{
			System.out.println("value i"+i);
			//System.out.println("This reference "+this); //this will not work here...can not used with static context
		});
		 */

		thisEx.execute();
	}

	interface Process{
		public void process(int a);
	}
}
