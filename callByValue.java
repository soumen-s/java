// Program to implement CALL BY VALUE

/*
    Here we pass *variables* as argument through methods. For which if we wanna modify 
    any variable through any method, the changes stay limited upto that method. And 
    after upgradation also, if we wanna access them from outside, then that shows us
    the previous values.
    Means call by value performs shallow copy concept.
*/
public class callByValue
{
    public static void swap(int a, int b) // changes are limited upto that function
    {
        int c = a;
        a = b;
        b = c;
        System.out.println("Inside method, a: " + a + ", b: " + b);
    }
    
   public static void main(String[] args)
   {
        int a = 30;
        int b = 45;
      
        System.out.println("\nBefore swapping, a = " + a + " and b = " + b);
        swap(a, b); // Passing variables as usual
        System.out.println("After swapping, a = " + a + " and b = " + b);
   }
}

//----------------------------- Example-2 ------------------------------

// class callByValue
// {
//     public static void increment(int number)
//     {
//         number = number + 1;
//         System.out.println("Value in method: " + number);
//     }
    
//     public static void main(String[] args) 
//     {
//         int number = 10;

//         System.out.println("\nValue before method call : " + number);
//         increment(number); // Passing variables as usual
//         System.out.println("Value after method call: "+number);
//     }
// }

//----------------------------- Example-3 ------------------------------

// class Test
// {
//     int a = 10;
    
//     void modify(int a)
//     {
//         a = a + 100;
//     }
// }

// public class callByValue
// {
// 	   public static void main(String[] args) 
// 	   {
// 	       Test t = new Test();

// 	       System.out.println("\nBefore modification : " + t.a);
// 		   t.modify(55); // Passing variables as usual
// 		   System.out.println("After modification : " + t.a);
// 	   }
// }