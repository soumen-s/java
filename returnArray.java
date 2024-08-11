// Program to see how to return an array from a method

/*
    Here we are modifying the array and returning it after
    adding 3 with each elements and then returning it from
    another function.
*/

import java.util.*;
public class returnArray
{
    public static int[] increseBy3(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i] + 3;
        }
        return arr;
    }
    
	public static void main(String[] args) 
	{
		int[] arr = {2,4,5,7,8};
		
		int[] result = increseBy3(arr); // array is stored in an array variable
		
		System.out.print(Arrays.toString(result)); // converting array into string so that we
                                                           // need not to use loop for printing
	}
}