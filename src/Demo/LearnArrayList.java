package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

	public static void main(String args[]) {
	 //String studentName[]= new String[30]; -- drawback fix size
	
	ArrayList<String> studentName = new ArrayList<>(); // makes empty array
	
	studentName.add("Ramesh"); // internal array of 10 size is made
	studentName.add("Suresh");
	studentName.add("Ganesh");
	
	//if initial size is n, after adding 10 elements, it will increase size to -- n+n/2+1.
	
	studentName.add(3, "Shivani"); // add element in some position// method overloading
	
	List<String> list = new ArrayList();
	list.add("50");
	list.add("100");
	
	studentName.addAll(list);
	
	System.out.println("list is :"+ studentName);
	
	//get element from list
	System.out.println(studentName.get(3));
	
	//remove elements from arraylist
	System.out.println("List element removed is :" +studentName.remove(4));
	System.out.println("list is :"+ studentName);
	
	studentName.set(2, "1000");
	System.out.println("list is :"+ studentName);
	
	System.out.println(studentName.contains("Shivani"));
	
	//adding and removing will shift the elements one right or one left so complexity is O(n)
	
	//iterate in list
	
	for (int i=0; i < studentName.size();i++) {
		System.out.println("The element is : " + (studentName.get(i)));
	}
	
	//also to iterate we an use for each
	for (String element: studentName) {
		
		System.out.println(element);
		
	}
	
	Iterator<String> it = studentName.iterator(); // iterator me kaafi saari 
	//functionalities hoti hai so that hm iterate kr paye easily
	System.out.println(it.hasNext()); // checks if iterator has any other element
	
	while (it.hasNext()) {
		System.out.println(it.next());//prints next element
		
	}
	}
}
