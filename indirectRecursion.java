// Program to perform INDIRECT RECURSION operation

/* 
    In Indirect Recursion, there may be more than one function
    and they are calling one another in a circular fashion.
*/

public class indirectRecursion
{
    public static void funA(int n)
    {
        if(n > 0)
        {
            System.out.print(n+" ");
            funB(n-1); 
        }
    }
    
    public static void funB(int n)
    {
        if(n > 1)
        {
            System.out.print(n+" ");
            funA(n/2); 
        }
    }
    
    public static void main(String[] args) 
    {
        funA(20);
    }
}

// Time Complexity ~ O(2^n)
// Space Complexity ~ O(n)