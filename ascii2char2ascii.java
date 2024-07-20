// program to convert an ascii value to character or vise-versa.

import java.util.*;

public class ascii2char2ascii
{
    public static void characterToAscii(char y)
    {
        int c2a = (int) y;
        System.out.println("The ascii value is: "+c2a);
    }
    
    public static void asciiToCharacter(int x)
    {
        char a2c = (char) x;
        System.out.println("The character is: "+a2c);
    }
    
    public static void main(String[] args) 
    {
            System.out.println("1. Ascii to character conversion: ");
            System.out.println("2. character to Ascii conversion: ");
        
            Scanner sc = new Scanner(System.in);
            
            System.out.print("\nEnter your choice: ");
            int x = sc.nextInt();
            
            if(x==1)
            {
                System.out.print("\nEnter the ascii value to get the character: ");
                int m = sc.nextInt();
                asciiToCharacter(m);
            }
            else if(x==2)
            {
                System.out.print("\nEnter the character to get ascii value: ");
                char n = sc.next().charAt(0);
                characterToAscii(n);
            }
            else
            {
                System.out.print("Invalid choice! ");
            }
    }
}