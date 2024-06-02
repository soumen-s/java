// program to convert an array into COLLECTION in java

import java.util.*;

public class collectionImplement 
{
	public static void main(String args[])
	{
		// array input
		String peopleArray[] = { "Ram", "Shyam", "Jadu", "Madhu" };
	
	        // to see the contents as a string representation
		//System.out.println("The array input is: " + Arrays.toString(peopleArray));
		
		System.out.print("The array input is: ");
		for(String person : peopleArray)
		{
		    System.out.print(person + " ");
		}
		System.out.println();
	
		// converting array into Collection with asList() function
		List playersList = Arrays.asList(peopleArray);
	
		// printing list elements
		System.out.println("The list elements are: " + playersList);
	}
}
