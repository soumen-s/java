// Program to convert a string to an array

import java.util.*;
public class string2charArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a string ~ ");
        String str = sc.nextLine();
        
        char[] arr = str.toCharArray();
        
        System.out.print("The character array form is : ");
        for(int i=0; i<arr.length; i++)
        {
        	System.out.print(arr[i]+" ");
        }  
    }
}
