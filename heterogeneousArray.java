// Program to perform HETEROGENEOUS array declaration

// it's basically a 2D array where each row(subarray) contains  
// arrays of different datatypes.

import java.util.*;

class heterogeneousArray
{
   
	public static void main(String[] args) 
	{
		Object[][] arr = new Object[5][];

		arr[0] = new Integer[]{11,22,33,44,55};
		arr[1] = new Character[]{'a','B','c','D','E','f'};
		arr[2] = new Double[]{11.2,33.4};
		arr[3] = new Boolean[]{false,false,true};
		arr[4] = new String[]{"apple","ball","cat","duck"};

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
