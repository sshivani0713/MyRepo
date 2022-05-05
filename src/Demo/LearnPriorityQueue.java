package Demo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
	
	public static void main (String args[]) {
		//gives priority to element in queue
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(50);
		pq.offer(70);
		pq.offer(20);
		pq.offer(40);
		pq.offer(30);
		pq.offer(60);
		
		
		//peek -- next in line element
		//offer add element
		//poll -- remove element
		
		System.out.println(pq);
		//implements min heap so min element is at top and baki ka arrangement aise hi h
		
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		
		//to check maximum number -- write comparator in constructor of priority queue
		
		//Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
		//this will bring largest element in the top
		
		
		}

}
