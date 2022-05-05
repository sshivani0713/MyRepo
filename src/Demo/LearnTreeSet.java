package Demo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
	
	public static void main (String args[]) {
		
		Set<Integer> set = new TreeSet<>();
		//it implements properties of both set(unique) and Binary Search Tree
		//O(logn)--BST
		
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
