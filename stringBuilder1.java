// Java Program to Convert ARRAY OF STRINGS to a STRING using toString() method

/*
    In Java, StringBuilder is a class that provides a way to create mutable 
    sequences of characters and allows us to modify the sequence of characters 
    it holds. The primary purpose of StringBuilder in Java is to efficiently 
    build and manipulate strings. It provides methods to append, insert, delete 
    and replace characters in a mutable sequence of characters.
*/

import java.util.*;

public class stringBuilder1
{

	public static void main(String[] args)
	{

		String arr[] = {"My", "name", "is", "Soumen"};

		// creating object of StringBuilder class where conversion will be done
		StringBuilder obj = new StringBuilder();

		// adding above arrays of strings to Stringbuilder object
        for(int i=0; i<arr.length; i++)
        {
            obj.append(" " + arr[i]);
        }

		// converting into single string
		String str = obj.toString();

		System.out.println("\nThe Single string form is -->"+ str);
	}
}
