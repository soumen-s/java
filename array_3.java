// Program to implement different static array operations

import java.util.Arrays; 
// In Java, java.util.Arrays is a utility class that provides various 
// methods for working with arrays. Here we're essentially telling the Java compiler 
// to include the Arrays class from the java.util package in our code.
// We can use '*' instead of Arrays to import all classes as an universal option.

class array_3
{
	public static void main (String arg[])
	{

		// To create a 5 size integer array
		int[] arr1 = new int[5];

		// Creating an array with direct initialization
		int[] arr2 = {12, 22, 31, 67, 7};

		// To see in-built sorting through function
		Arrays.sort(arr2);
		System.out.println("After sorting, the 1st element is: " + arr2[0]);


		// Different for loop implementation for traversing
		int[] arr3 = {12,33,42,67,92};
		System.out.print("Traversing ~ ");
    	    for (int element : arr3)
    	    {
    		    System.out.print(element+" ");
    	    }

	}
}
