// Program to perform TREE RECURSION operation

/* 
    It is a type of recursion in which recursive function 
    calling itself for more than one time.
*/

public class trerRecursion
{
    public static void fun(int n)
    {
        if(n > 0)
        {
            System.out.print(n+" ");
            fun(n-1); 
            fun(n-1);
            return;
        }
    }
    
	public static void main(String[] args) 
	{
		fun(3);
	}
}

// Time Complexity ~ O(2^n)
// Space Complexity ~ O(n)