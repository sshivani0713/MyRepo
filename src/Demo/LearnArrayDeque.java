package Demo;

import java.util.ArrayDeque;

public class LearnArrayDeque {
	public static void main (String args[]) {
	
	ArrayDeque<Integer> adq = new ArrayDeque<>();
	//It also implements queue so all the methods in queue are implemeted here
	
	
	adq.offer(50);
	adq.offer(70);
	adq.offer(20);
	adq.offer(40);
	adq.offer(30);
	adq.offer(60);
	System.out.println(adq);
	adq.offerFirst(100); // add element at head

	System.out.println(adq);
	adq.offerLast(45); // add element at last
	System.out.println(adq);
	//similary 
	adq.peek();
	adq.peekFirst();
	adq.peekLast();
	
	adq.poll();
	adq.pollFirst()	;
	adq.pollLast();
	
	//we can also implement stack with this like use offer to add element 
	//and use polllast to remove from last
	
	
	
	
	}
}
