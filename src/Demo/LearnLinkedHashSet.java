package Demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
	
	public static void main (String args[]) {
	
		Set<Integer> set = new LinkedHashSet<>();
		//it implements properties of both set(unique) and linkedlist(in order they are added)
		
		//it generates hash of the elements being added and this hash is unique.
		
		set.add(32);
		set.add(2);
		set.add(5);
		
		
		set.remove(5);
		set.contains(100); //returns boolean
		
		set.isEmpty();//returns boolean checks if set has values or not
		
		set.clear();// remove elements from set
		set.size(); // number of elements of set
		

	
	
	
	
	
	}
	
	
	
	

}
