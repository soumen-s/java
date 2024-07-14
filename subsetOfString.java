// Program to identify the SUBSETs of a string characters 

/*
    subset is all about including & excluding of each character
    at every level in a tree.
*/

public class subsetOfString
{
    public static void subset(String str, String hold, int i)
    {
        if(str.length() == i) // 3 == 3  means all choices of characters are collected
        {
            if (hold.length() == 0)
            {
                System.out.print("null");  // for the last one..
            }
            else
            {
                System.out.print(hold+" ");
            }
            return;
        }
        
        char currChar = str.charAt(i);
        
        subset(str, hold+currChar, i+1); // take the character
        subset(str, hold, i+1);  // don't take the character
    }
    
    public static void main (String[] args)
    {
        String str = "ABC";
        System.out.print("The subset elements are: ");
        subset(str,"",0);
    }
}