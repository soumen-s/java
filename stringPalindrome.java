// Program to perform STRING PALINDROME operation
// Here we wanna check whether a string is have a palindrome number like structure or not.

import java.util.*;
public class stringPalindrome
{
    public static boolean strPalindrome(String str)
    {
        int start = 0;
        int end = str.length()-1;
        while(start <= end)  // Or we can implement the concept of mid
        {
            if(str.charAt(start++) == str.charAt(end--))  // automatically ignore cases
            {                          // Checking from start & end 
                return true;
            }
        }
        return false; // if it doesnot match
    }
	public static void main(String[] args) 
	{
	    System.out.print("\nEnter the string: ");
	    Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
		
	    if(strPalindrome(str))
	        System.out.println(str + " ~ is a Palindrome string.");
	    else
	        System.out.println(str + " ~ is not a Palindrome string.");
	}
}
