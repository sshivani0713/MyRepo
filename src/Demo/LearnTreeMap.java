package Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnTreeMap {
	
	//sort on the basis of keys
	//O(log n)
	
	public static void main (String args[]) {
		
		Map<Integer, String> mapnum = new TreeMap<>();
		
		
		mapnum.put(1, "One");
		
		mapnum.put(2, "Two");
		mapnum.put(3, "Three");
		mapnum.put(4, "Four");
		mapnum.put(5, "Five");
		
		mapnum.putIfAbsent(6, "Six");// add value if absents
		
		//iteration in maps
		for (Entry<Integer, String> e : mapnum.entrySet()) {
			
			System.out.println(e);
			System.out.println(e.getValue());
			System.out.println(e.getKey());
			
			
		} 
		
			
			
		
		
		
		
		
		
	}

}
