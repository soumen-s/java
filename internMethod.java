// Program to implement INTERN METHOD 

/*
    In Java, the intern() method is used to place strings into the "interned" 
    pool(string constant pool) of strings. This pool is a special area in 
    memory where Java stores unique string literals. When we call intern() 
    on a string object, Java checks if there is already a string with the 
    same value in the interned pool. If there is, it returns a reference to that
    string. If not, it adds the string to the pool and returns a reference to it.
*/

public class internMethod
{  
    public static void main(String args[])
    {  
        String s1=new String("hello"); //  // belongs from heap area
        
        String s2="hello";  // belongs from string constant pool
        
        String s3=s1.intern();  // returns string from heap area to the string pool, 
                                // now it will be same as s2  

        System.out.println(s1==s2); //false - as they are in different instances
        System.out.println(s2==s3); //true - as they are in same instances
    }
    
}  