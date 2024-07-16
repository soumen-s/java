// Program to implement CALL BY REFERENCE

/*
    Here we pass *class objects* as argument through methods just like passing address
    through functions in C. For which if we wanna modify any variable through any
    method, the changes stay permanently. After upgradation of variables, if we 
    wanna access them from outside, then that shows us the upgraded values.
    
    Means call by reference performs deep copy concept.
*/

public class callByReference
{
    int a = 30, b = 45;
    
    public static void swap(callByReference c)
    {
        int x = c.a;
        c.a = c.b;
        c.b = x;
        System.out.println("Inside method, a = " + c.a + ", b = " + c.b);
    }
    
    public static void main(String[] args)
    {
        callByReference c = new callByReference();
        
        System.out.println("\nBefore swapping, a = " + c.a + " and b = " + c.b);
        swap(c); // pass object as parameter
        System.out.println("After swapping, a = " + c.a + " and b = " + c.b);
    }
}

//----------------------------- Example-2 ------------------------------

// class callByReference
// {
//     public static void increment(int number)
//     {
//         number = number+1;
//         System.out.println("value in method: "+number);
//     }
    
//     public static void main(String[] args) 
//     {
//         int number = 10;

//         System.out.println("value before method call : " + number);
//         increment(number); // pass object as parameter
//         System.out.println("value after method call: " + number);
//     }
// }