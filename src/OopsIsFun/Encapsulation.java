package OopsIsFun;
import Banks;
import java.util.*;

public class Encapsulation {
	
	//know about packages and access modifiers
	//access modifiers - default -- only files inside package can access it
	//protected can be accessed within same class and in other package class with its child class
	//private --only accessed by that particular class not even by child classes or any other class
	//on package or out of package
	//we implement data hiding concept with encapsulation -- using access modifier
	
	public static void main(String args[]) {
		
		Banks.Account account1 = new Banks.Account();
		
		account1.name="Shivani";
		
	}
	

}
