// Program to perform all type of Singly linkedlist insertions and deletions

public class SinglyLinkedListAll
{
    public class node   // class building
    {
        int data;
        node next;
        
        public node(int data)  // constructor building
        {
            this.data = data;
        }
    }
    
    public static node head;  // node type variables
    public static node tail;
    public static int size;
    
    public void insertBeg(int data)
    {
        node begnode = new node(data);  // references of the (class node) so that 
        size++;                         // we can use parameters associated with it
        
        if(head == null)
        {
            head = tail = begnode;
            return;
        }
        else
        {
            begnode.next = head;
            head = begnode;
        }
    }
    
    public void insertEnd(int data)
    {
        node endnode = new node(data);
        size++;
        
        if(head == null)
        {
            head = tail = endnode;
            return;
        }
        else
        {
            tail.next = endnode;
            tail = endnode;
        }
    }
    
    public void insertAny(int data,int pos)
    {
        node anynode = new node(data);
        size++;
        
        if(head == null)
        {
            head = tail = anynode;
            return;
        }
        if(pos == 1)
        {
            insertBeg(data);
        }
        node ptr1 = head;
        node ptr2 = head.next;
        
        for(int i=1; i<pos-1; i++)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        ptr1.next = anynode;
        anynode.next = ptr2;
        
    }

    public void deleteBeg()
    {
        int store = head.data;
        // node ptr = head;
        // ptr = ptr.next;
        // ptr.next = head;
        head = head.next;
        System.out.println("The deleted begining node is: "+store);
        size --;
    }

    public void deleteEnd()
    {
        int store = tail.data;
        node ptr = head;
        while(ptr.next.next != null)
        {
            ptr = ptr.next;
        }
        ptr.next = null;
        tail = ptr;
        System.out.println("The deleted end node is: "+store);
        size --;
    }

    public void deleteAny(int pos)
    {
        if(pos == 1)
        {
            deleteBeg();
            size++;
        }
        else
        {
            node ptr1 = head;
            node ptr2 = head.next;
            for(int i=1; i<pos-1; i++)
            {   
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        
            int store = ptr2.data;
            ptr1.next = ptr2.next;
            System.out.println("The deleted node "+pos+" is: "+store);
        }
        
        size--;
        
    }
    
    public static void display()
    {
        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("The size of the list is: "+size+"\n");
    }
    
	public static void main(String[] args) 
	{
		SinglyLinkedListAll ll = new SinglyLinkedListAll();  
		/*references of the (class SinglyLinkedListAll) so that we can use the methods associated with it.*/

		ll.display();
		ll.insertBeg(11);
		ll.display();
		ll.insertBeg(22);
		ll.insertEnd(33);
		ll.insertBeg(44);
		ll.insertEnd(55);
		ll.display();
		ll.insertEnd(99);
		ll.display();
		ll.insertAny(100,3);
		ll.insertAny(200,5);
		ll.display();
		//------------------ deletion operations ------------------
		ll.deleteBeg();
		ll.display();
		ll.deleteEnd();
		ll.display();
		ll.deleteAny(1);
		ll.display();
	}
}
