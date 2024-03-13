// Program to implement dynamic array operation

import java.util.Scanner; // for taking input
import java.util.Arrays;

class arrayDynamic_3
{
    public static void main(String arg[])
    {
    	//int[] arr = new int[5];
    	System.out.print("\nEnter the size of the array: ");
        

    	Scanner scn = new Scanner(System.in);
    	int n = scn.nextInt();   // Taking the input of array size using Scanner named scn

    	int arr[] = new int[n];  // creating new array of n size


    	System.out.println("\nEnter the array elements: ");
    	for (int i=0; i<n; i++)  // loop for element input
    	{
    		System.out.print("Enter arr["+(i+1)+"] : ");
    		arr[i] = scn.nextInt();  // Taking the input of array element using Scanner named scn
    	}	


        System.out.print("\nThe elements are: ");
    	for (int i=0; i<n; i++)  // Loop for element output
    	{
            System.out.print(arr[i]+" ");
    	}    	
    }
}