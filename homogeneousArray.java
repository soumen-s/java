// program to perform HOMOGENEOUS array

/*
It's homogeneous because it's containg same datatyped value in each individual row.
Although here designing of that multi dimensional array is little different.
The actual visualization of 2D array is ~
Here we firstly defined that how many rows of arrays are there, means allocate the 
subarray addresses, but we doesnt defined what are the sizes of that subarrays, which we've
performed at previous programs and that was actually fixed in size. After defining the 
rows, we directly initialize the subarrays by their values. 
*/

import java.util.*;

class homogeneousArray
{
   
	public static void main(String[] args) 
	{
 		int[][] arr = new int[3][];
// 		int[][] arr = new int[][5];  // error, we cant define subarray sizes previously

 		arr[0] = new int[]{11,22,33};
 		arr[1] = new int[]{3,4,5,6,7};
 		arr[2] = new int[]{44,55};

 		for(int i=0; i<arr.length; i++)
 		{
 			for(int j=0; j<arr[i].length; j++)
 			{
 				System.out.print(arr[i][j]+" ");
 			}
 		  System.out.println();	
 		}

	}
}
