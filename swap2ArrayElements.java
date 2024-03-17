// Program to swap the elements of 2 arrays with each other

import java.util.*;

class swap2ArrayElements
{
   public static void main(String[] args)
   {
       System.out.print("\nEnter the size of the array: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       System.out.println("\nFor the first Array: \n");
       int arr1[] = new int[n]; 
       for (int i=0; i<n; i++)
       {
       	  System.out.print("Enter arr1["+(i+1)+"]: ");
       	  arr1[i] = sc.nextInt();
       }

       System.out.println("\nFor the second Array: \n");
       int arr2[] = new int[n]; 
       for (int i=0; i<n; i++)
       {
       	  System.out.print("Enter arr2["+(i+1)+"]: ");
       	  arr2[i] = sc.nextInt();
       }

       // Swaping..
       int temp;
       for (int i=0; i<n; i++)
       {
           temp = arr1[i];
           arr1[i] = arr2[i];
           arr2[i] = temp;
       }

       System.out.print("\n1st array after swapping:");
       for (int i = 0; i < n; i++) 
	   {
         System.out.print(arr1[i]+" ");
       }

       System.out.print("\n2nd array after swapping:");
       for (int i = 0; i < n; i++) 
	   {
         System.out.print(arr2[i]+" ");
       }
   }
}