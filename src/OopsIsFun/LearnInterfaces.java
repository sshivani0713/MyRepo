package OopsIsFun;

public class LearnInterfaces {
	public static void main (String args[]) {
		
		
		
	}
	//interfaces are classes only 
	//interfaces me na koi non abstract method hoga -- or fir implementation to hogi hi nhi
	//interfaces ke constructor bhi nhi hote
	// pure abstraction ke liye use hota h
	//all variables are public,static --same for all animals,final -value fix rhegi for all animals
	//methods are by default public and abstract
	//java ke ander multiple inheritance nhi hota h 
	//java me multiple inheritance interface ki help se implement hota h
	

}

interface Animals {
	
	public void walk();
	
	
}

interface Herbivore{
	
	
}

class Horses implements Animals,Herbivore { //multiple inheritance achieved
	public void walk() {
	
		System.out.println("Walk on 4 legs");
	
}
}

