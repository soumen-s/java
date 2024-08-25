// Leetcode - 14 ~> Longest Common Prefix

/*
    Program to find out the longest & common prefix that is present
    to each element(string) of the array.
*/

import java.util.Arrays;
public class leetcode_14
{
    public static String commonPrefix(String[] arr)
    {
        Arrays.sort(arr); // means first & last's comparison can hold 
                          // whole result of the array.
        String first = arr[0];
        String last = arr[arr.length-1];

        String add = "";
        int size = Math.min(first.length(), last.length());
        
        if(arr.length == 0) 
            return "";

        for(int i=0; i<size; i++)
        {
            if(first.charAt(i) == last.charAt(i))
                add = add + first.charAt(i);
            else
                break;
        }

        if(add.length() == 0) // in case of no matching
            return "Empty";
        else
            return add;
        
    }
    
	public static void main(String[] args) 
	{
		String[] arr = {"flower","flow","flight"};
		//String[] arr = { "goodorbetter", "good", "goodddddd","goods" };
		//String[] arr = { "dog","racecar","car" };
		
		String result = commonPrefix(arr);
		
		System.out.println("\nThe longest common prefix is: " + result);
	}
}