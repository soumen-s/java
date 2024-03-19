// Program to implement 'Variable Argument'

// We declare a variable argument using 3 dots before it. We use these arguments so that
// we can pass the values from that position to upto the last. We can understand it in 
// such a way that we are putting all these value in a vartual array in main that contains
// the variables upto the last and passing it through it's appropriate function.
 
// And if we wanna pass any mandatory array with it, then we've to declare it at first.

import java.util.*;

class variableArgument
{
	static void average(int x, char ...y)    // x is mandatory and y is variable argument
	{
		System.out.print("\nHere the variable arguments are ~ ");
		for(char i:y)
		{
			System.out.print(i + " ");
		}

		System.out.print("\nWhile, " + x + " is a mandatory argument");
	}

    public static void main(String[] args) 
    {   
     	average(2,'a','b','c','d','e');   // we can't add the mandatory argument at
    }                                     // end as we don't know how much long will it
}
