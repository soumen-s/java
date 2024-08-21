// Leetcode - 20
/*
    Program to check whether a set of parentheses are valid or not. Here we've
    used ArrayList(considering it as a stack) instead of array so that we can 
    use in built small functions like add, remove, size or get.
*/    

import java.util.*;
public class validParentheses
{
    //static ArrayList<Character> stack = new ArrayList(); // need not to declare
    //static int top = -1;                                 // globally
    
    public static char isMatching(char c)
    {
        if(c=='}')  return '{';  // then { == {
            
        else if(c==')')  return '(';
            
        else  return '[';    
    }
    
    public static boolean isValid(String str)
    {
        ArrayList<Character> stack = new ArrayList();
        if(str == null)
        {
            return true;
        }
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                stack.add(c);
                //top++;
            }
            else
            {
                if(stack.size() == 0)  
                {
                    return false;
                }
                if(isMatching(c) == stack.get(stack.size()-1)) // }->{ == {
                {
                    stack.remove(stack.size()-1);
                    //top--;
                }
                else
                {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
    
    public static void main(String[] args) 
    {
        String str = "{}{()}}";  // or give "(){}[]"

        if(isValid(str))
            System.out.println("\nThe set of parentheses are valid.");
        else
            System.out.println("\nThe set of parentheses are not valid.");
    }
}