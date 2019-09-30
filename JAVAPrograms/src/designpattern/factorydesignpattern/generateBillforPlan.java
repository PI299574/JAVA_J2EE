package designpattern.factorydesignpattern;

/*Factory Method Pattern

A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating
an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible
to create the instance of the class.

The Factory Method Pattern is also known as Virtual Constructor.
Advantage of Factory Design Pattern

    Factory Method Pattern allows the sub-classes to choose the type of objects to create.
    It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. 
    That means the code interacts solely with the resultant interface or abstract class, so that it will work 
    with any classes that implement that interface or that extends that abstract class.

Usage of Factory Design Pattern

    When a class doesn't know what sub-classes will be required to create
    When a class wants that its sub-classes specify the objects to be created.
    When the parent classes choose the creation of objects to its sub-classes*/
abstract class Plan{
	int rate;
	abstract void getRate();
	public void generateBill(int unit){
		System.out.println("Bill is **** "+unit*rate);
	}
}
class Domestic extends Plan{

	@Override
	void getRate() {
		// TODO Auto-generated method stub
		rate = 10;
	}
}

class Commercial extends Plan{

	@Override
	void getRate() {
		// TODO Auto-generated method stub
		rate = 20;
	}
}

class PlanFactory{
	
	public Plan getPlan(String type){
		
		if(type == null)
		return null;
		else if("commercial".equalsIgnoreCase(type)){
			return new Commercial();
		}
		else if("domestic".equalsIgnoreCase(type)){
			return new Domestic();
		}
		return null;
	}
}
public class generateBillforPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlanFactory plan=new PlanFactory();
		Plan p=plan.getPlan("domestic");
		p.getRate();
		p.generateBill(10);		
		
	}

}
