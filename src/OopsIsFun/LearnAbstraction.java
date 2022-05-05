package OopsIsFun;

public class LearnAbstraction {
	
	public static void main (String args[])
	{
		Horse hr = new Horse();
		hr.walk();
		
		
		
	}
	

}

abstract class Animal{ // abstraction means ek concept hai...jiske baare me hm soch skte h 
	//lekin use ni kr skte
	//abstract class me jo properties h function hai use hm abstract kr skte h...
	//koi implementation nhi hoga abstract method ka
	//abstract class declared with abstract keyword
	//it can have abstract as well as non abstract methods
	//abstract method don't have any implementation
	//it can have constructors and static methods also
	//suppose we create a constructor of derived class the at the time of 
	//creating object of derived class first constructor or base class is called
	//then child class constructor -- this is constructor chaining
	abstract void walk();
	public void eats() {
		
		System.out.println("Animal eats");
	}
	
	
	
	
}


class Horse extends Animal{
public void walk() {
		
	System.out.println("Walk on 4 legs");
		
	}
	
	
}

class Chicken extends Animal{
	
public void walk() {
		
	System.out.println("Walk on 2 legs");
		
	}
	
	
}