// Program to perform STRING PERMUTATION (permutation in string)

import java.util.*;
public class q3_stringPermutation
{
    public static void printPerm(String str, String permutation)  
    {                             // permutation - to get the resultant string
        if(str.length() == 0)     // str - to caught the rest of the string    
        {                                     
            System.out.print(permutation+" ");
            return;
        }
        
        for(int i=0; i<str.length(); i++)
        {
            char currChar = str.charAt(i);  // choose 1 character
            String newStr = str.substring(0,i)+str.substring(i+1); //hold rest of the part
            printPerm(newStr, permutation+currChar); // insert the characters 1 by 1
        }                                            // which is cutting out from str
    }
    
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
            System.out.print("\nEnter the string : ");
            String str = sc.nextLine();
            
            System.out.print("All the permutations are: ");
            printPerm(str,""); // taking an empty string
	}
}
