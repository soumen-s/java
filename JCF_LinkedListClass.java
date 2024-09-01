// Program to understood "LinkedList" class which implements the Queue interface

/*
    "The Queue interface allows a LinkedList object to behave like a queue."
    LinkedList is based on 2 interfaces. One is Queue & another one is List.
    While we implement QUEUE class using 'ArrayList' class or 'List' interface, then
    we can use all the ArrayList or list methods. But if we use 'LinkedList' as a 
    reference, then we can access only the methods defined in the Queue interface, 
    not all LinkedList methods. The methods are- 
    
    -----offer(to add), peek(to peek) & poll(to remove from queue)-----
    they will return null if they are unable to perform
    
    But there are some more methods corresponding to that 3 methods
    
    -----add(offer), element(peek) & remove(poll)-----
    they will throw exception error if they are unable to perform
*/

import java.util.Queue;
import java.util.LinkedList;
public class JCF_LinkedListClass
{
	public static void main(String[] args) 
	{
		Queue<Integer> nums = new LinkedList<>();
		
		nums.offer(11);  // add is used rarely
		nums.offer(22);
		nums.offer(33);
		nums.offer(44);
		
		System.out.println(nums);  // to print all
		
		System.out.println("The top element: "+nums.peek());
		//System.out.println(nums.element()); // throw exception if there is no element
		
 		System.out.println("The popped element: "+nums.poll());
 		//System.out.println(nums.remove());  // throw exception if there is no element
		
		System.out.println(nums);
	}
}