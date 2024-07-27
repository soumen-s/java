// Program to check whether a character is vowel or not

import java.util.*;
public class vowelOrNot
{
    public static boolean isVowel(char c)
    {
        char ch = Character.toLowerCase(c);   // most efficient way
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'); // true or false
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the character: ");
        char c = sc.next().charAt(0);
        
        if(isVowel(c))
            System.out.println("Yes, " + c + " is a vowel.");
            
        else
            System.out.println("No, " + c + " is not a vowel.");
    }
}