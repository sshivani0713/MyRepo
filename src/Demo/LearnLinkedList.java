package Demo;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {
	
	
	public static void main (String args[]) {
		
		//linklist is a class which has implemented multiple interfaces..
		// so it has implemented queue as well
		//lets first talk about queue -- first in first out
		
		//we can implement queue using array and linkedlist
		//queue is a inerface which can be implemeted by arraylist /linked list/priority queue
		
		Queue<Integer> queue = new LinkedList(); // linkedlist Implemets kr raha hai queue interface ko
		// add elements to queue
		
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		queue.offer(48);
		queue.offer(62);
		queue.add(60);
		
		System.out.println(queue);
		
		System.out.println(queue.poll()); //remove the element
		System.out.println(queue.remove());
		
		System.out.println(queue);
		
		System.out.println(queue.peek());// next element in line
		System.out.println(queue.element());
		
		
		
		
		
		
		
		
		
		
	}

}
