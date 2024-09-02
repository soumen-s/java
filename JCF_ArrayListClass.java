// Program to see the implementation of ARRAYLIST CLASS & important methods of it.
/*
    It is an upgrade on 'arraylistDetails' program.

    ArraList is a class which blongs from list interface. List interface is 
    a catagory of Java Collection Framework. Java ArrayList class uses a 
    dynamic array for storing the elements. It is like an array, but there is
    no size limit. It implements the List interface so we can use all the 
    methods of the List interface here.

    We can traverse the whole arraylist by using for loop.
*/

import java.util.List;
import java.util.ArrayList;

public class JCF_ArrayListClass
{
	public static void main(String[] args) 
	{
		// ArrayList<Integer> list = new ArrayList<>(); // or
		List<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		
		System.out.println(list);
		
		list.add(2,99); // add on that specific index rightshift next ones
		System.out.println(list);
		
		list.set(4,88); // update the element by the latest one
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println(list.get(3));
		
                list.remove(6);
		System.out.println(list);
		
		list.remove(Integer.valueOf(200));
		System.out.println(list);
		
		System.out.println(list.contains(99));
		
		list.clear();
		System.out.println(list);
	}
}