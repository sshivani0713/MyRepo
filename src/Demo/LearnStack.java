package Demo;

import java.util.Stack;

public class LearnStack {
	
	//collection of unique objects -- last in First Out
	
	public static void main (String args[]) {
		Stack<String> animals = new Stack<>();
		
		//add elements in stack 
		
		animals.push("Dog");
		animals.push("Cat");
		animals.push("Cow");
		animals.push("Lion");
		
		System.out.println("animals are :"+animals);
		
		animals.peek(); // tell which element is at top
		
		System.out.println("Top animals are :"+animals.peek());
		
		//remove element from stack -- top element will be removed
		
		System.out.println("removed animal is :" +animals.pop());
		
		
		
	}

}
