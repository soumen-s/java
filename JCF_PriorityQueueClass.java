// Program to implement "PriorityQueue" class which belongs from 'Queue' interface

/*
    A PriorityQueue is used when we want to implement an order(priority) 
    inside the queue. Means it'll use almost same methods that the 
    LinkedList was using when that was also belonging from 'Queue' interface.
    
    It will work as a "min heap" by default. Means in the beginning of the 
    array it'll show the smallest number and other numbers will be set at any
    order due to heapify.(in case of Integer). But in case of String, the words
    that starts with smallest character (in case of String). Means the strings
    will stay in completely sorted order.
    
    But we can use it to implement "max heap" where it'll throw largest value on top.
*/

import java.util.Comparator;  // while we wanna use maxheap
import java.util.Queue;
import java.util.PriorityQueue;

public class JCF_PriorityQueueClass
{
	public static void main(String[] args) 
	{		
		Queue<Integer> pq = new PriorityQueue<>();  // works as MINHEAP

		// PriorityQueue<Integer> pq = new PriorityQueue<>(); // or

		// But one change can make it works as MAXHEAP
		//Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 

                pq.offer(16);   
                pq.offer(1);
                pq.offer(31);
                pq.offer(7);
                pq.offer(10);
                pq.offer(5);
        
		System.out.println(pq);
		
		pq.poll();  //like pop
		System.out.println(pq); // next smallest element will come first
		
		System.out.println(pq.peek()); 
		
	}
}