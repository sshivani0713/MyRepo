package Demo;

import java.util.Arrays;

public class LearnArrayClass {

	
	
	public static void main (String args[]) {
		
		
//for primitive arrays
		
		int a[]= {3,2,5,1,7,23,56,43,12,56};
	Arrays.sort(a);
	
	for(int i : a) {
	System.out.println(a.toString());
	}
	
	}
}
