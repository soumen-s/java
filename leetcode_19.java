// Leetcode - 19
// Remove nth node from end of the list

class leetcode_19 
{
	static class ListNode 
	{
		int data;
		ListNode next;
		ListNode(int data) 
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public static void display(String i,ListNode head) 
	{
	    System.out.print("\n"+i+" Linked list is : ");
	    ListNode ptr = head;
	    while(ptr != null) 
	    {
	        System.out.print(ptr.data+"->");
	        ptr = ptr.next;
	    }
	    System.out.println("null");
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) 
	{
        ListNode temp = head;
        int size = 0;
        while(temp != null) 
        {
            temp = temp.next;
            size++;
        }
        temp = head;
        int front = size - n;
        if(front == 0) 
        {
            head = head.next;
            return head;
        }
        for(int i=1; i<front; i++) 
        {                            // f = 4
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
	public static void main(String[] args) 
	{
	    
	    ListNode l1 = null;
	    ListNode l2 = null;
	    
	    {
		    ListNode a = new ListNode(2);  // 1
		    ListNode b = new ListNode(4);  // 2
		    ListNode c = new ListNode(5);  // 3*
		    ListNode d = new ListNode(13); // 4
		    ListNode e = new ListNode(14); // 5
		    l1 = a;
		    a.next = b;
		    b.next = c;
		    c.next = d;
		    d.next = e;
	    }
	    
	   display("First",l1);
	   ListNode ans = removeNthFromEnd(l1,3);
	   display("Final",ans);
	}
}