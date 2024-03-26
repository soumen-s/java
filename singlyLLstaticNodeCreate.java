// Linked list basics of statically node creation

import java.util.*;

class singlyLLstaticNodeCreate
{
    static class node
    {
    	int data;   // class properties
    	node next;

    	node(int d)  // constructor - so that we can push value to each node easily
    	{
    		data = d;
    	}
    }
    
	public static void main(String[] args) 
	{
 		node n1 = new node(5);  // pushing data from references,without using dot operator
 		node n2 = new node(3);
 		node n3 = new node(9);
 		node n4 = new node(8);
 		node n5 = new node(16);

 		n1.next = n2;  // linking
 		n2.next = n3;
 		n3.next = n4;
 		n4.next = n5;
 		n5.next = null;

 		node temp = n1;  // for tracking and traversing purpose


 		System.out.print("\nAll the elements are: ");
 		while(temp != null) // or for(int i=0; i<5; i++)
 		{
 			System.out.print(temp.data+" ");
 			temp = temp.next;

 		}
	}
}