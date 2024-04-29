// Program to implement VECTOR CLASS with some important methods

/*
    There is a little difference between size and capacity.
    we can declare the size or not while initializing the vector class.
    it's size will always show zero at starting as size declaration doesnot matter.
    and after adding elements it will show that updated size.
    
    But it helps in calculating capacity. The capacity will be same as
    the declared size. And when capacity crosses that limit, it increased
    in double for every limit(of size) crossing.
    
    If we dont declare size, then capacity will start from 10. And will increase
    by doubling its size for every crossing
*/

import java.util.*; // to import Vector class
public class vectorClass
{
	public static void main(String[] args) 
	{
	    // Vector list = new Vector(4); // The actual declaration with size but
                                            // it will show warning at compile time

	    /* In Java, when you use collections like Vector, it's recommended to use 
	    generics to specify the type of elements the collection will hold. This
	    ensures type safety at compile time and helps prevent errors. */

	    Vector<Object> list = new Vector<>(4); // Using generics
	    
	    System.out.println(list.size());
	    System.out.println(list.capacity()); // 4
	    
	    list.addElement("Hello");
	    list.addElement('J');      
	    list.addElement(10);       // any type of data 
	    list.addElement(7.9);      //  we can insert
	    list.addElement(9);
            list.addElement('k');
            
            System.out.println(list.size());
            System.out.println(list.capacity()); // 8, as the limit crossed
            System.out.println(list); // display entire list
            
            System.out.println(list.elementAt(3));
            
            System.out.println(list.removeElement(7.9));  // return type >> boolean
            System.out.println(list);
            
            list.removeElementAt(3);  // return type >> void
            System.out.println(list);
            
            list.removeAllElements();  // to remove all elements
            System.out.println(list);
	}
}