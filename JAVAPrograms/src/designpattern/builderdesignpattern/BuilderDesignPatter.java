package designpattern.builderdesignpattern;

/*Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"
Benfits:
It provides clear separation between the construction and representation of an object.
It provides better control over construction process.
It supports to change the internal representation of objects
*/
class User{
	//All final attributes
	private final String firstName;  //manndatory attributes
	private final String lastName;   //mandatory attributes
	private final int age;
	private final String location;
	
	private User(UserBuilder builder){
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.age=builder.age;
		this.location=builder.location;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", location=" + location + "]";
	}

	static class UserBuilder{
		private final String firstName;
		private final String lastName;
		private int age;
		private  String location;
		
		public UserBuilder(String firstName, String lastName){
			this.firstName=firstName;
			this.lastName=lastName;
			
		}
		public UserBuilder age(int age){
			this.age=age;
			return this;
		}
		public UserBuilder location(String location){
			this.location=location;
			return this;
		}
		public User build(){
			User user=new User(this);
			validateUser(user);
			return user;
		}
		private void validateUser(User user) {
			// TODO Auto-generated method stub
		System.out.println("Validated......");	
		}
	}
}

public class BuilderDesignPatter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			User user1=new User.UserBuilder("", "lastName").build();
			System.out.println(user1);
			User user2=new User.UserBuilder("Lokesh", "Rahul").age(25).build();
			System.out.println(user2);
	}
}
/*
 Where we need Builder Pattern

We already know the benefits of immutability and immutable instances in application.
 If you have any question over it, the please let me remind you of String class in java. 
 And as I already said, builder pattern helps us in creating immutable classes with large set of state attributes.

Let’s discuss a common problem in our application. In any user management module, primary 
entity is User, let’s say. Ideally and practically as well, once a user object is fully created,
 you will not want to change it’s state. It simply does not make sense, right? Now, let’s assume, 
 our User object has following 5 attributes i.e. firstName, lastName, age, phone and address.

In normal practice, if you want to make a immutable User class, then you must pass all five 
information as parameters to constructor. It will look like this:
public User (String firstName, String lastName, int age, String phone, String address){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.phone = phone;
    this.address = address;
}

Very good. Now what if only firstName and lastName are mandatory and rest 3 fields are optional. Problem !! We need more constructors.
public User (String firstName, String lastName, int age, String phone){ ... }
public User (String firstName, String lastName, String phone, String address){ ...  }
public User (String firstName, String lastName, int age){ ...   }
public User (String firstName, String lastName){ ...    }

We will need some more like above. Still can manage? Now let’s introduce our sixth attribute i.e. salary. Now it is problem.

One way it to create more constructors, and another is to loose the immutability and introduce setter methods. You choose any of both options, you loose something, right?

Here, builder pattern will help you to consume additional attributes while retaining the immutability of Use class.
A sample implementation using Builder Pattern

Below is the coded solution of problem we discussed above. This uses a additional class UserBuilder which helps us in building desired User object with all mandatory attributes and combination of optional attributes, without loosing the immutability.
public class User
{
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
 
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }
 
    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
 
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
 
    public static class UserBuilder
    {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;
 
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        //Return the finally consrcuted User object
        public User build() {
            User user =  new User(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(User user) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}

And below is the way, we will use the UserBuilder in our code:
public static void main(String[] args) {
    User user1 = new User.UserBuilder("Lokesh", "Gupta")
    .age(30)
    .phone("1234567")
    .address("Fake address 1234")
    .build();
 
    System.out.println(user1);
 
    User user2 = new User.UserBuilder("Jack", "Reacher")
    .age(40)
    .phone("5655")
    //no address
    .build();
 
    System.out.println(user2);
 
    User user3 = new User.UserBuilder("Super", "Man")
    //No age
    //No phone
    //no address
    .build();
 
    System.out.println(user3);
}
 
Output:
 
User: Lokesh, Gupta, 30, 1234567, Fake address 1234
User: Jack, Reacher, 40, 5655, null
User: Super, Man, 0, null, null

Please note that above created user object does not have any setter method, 
so it’s state can not be changed once it has been built. This provides the desired immutability.

Sometimes developers may forget to add support for a new attribute to the builder 
when they add that attribute to the User class. To minimize this, we should enclose the builders
 inside the class (as in above example) that they build so that 
it’s more obvious to the developer that there is a relevant builder that needs to be updated too.
 */