// Program to perform NESTED RECURSION operation (Example)

/* 
    In a Nested Recursion, a recursive function
    take a recursive call as a parameter.
*/

public class nestedRecursion
{
    public static int fun(int n)
    {
        if(n > 100)
            return n-10;
        else
            return fun(fun(n+11));
    }
    
    public static void main(String[] args) 
    {
        int hold = fun(95);
        System.out.print(hold);
    }
}
