// Program to see how the SUPER keyword works for Constructors, Methods & variables

/*
    We've to remind that super class works upto the upper class
    which has been extended by the current class. we can not access the 
    top most parent class using the super defined at the end of the
    chain when there are 3 or more inherited classes.
    
    In that case, we've to use the chaining of super keyword to reach.
*/

class Test1
{
    int var1 = 22;
    
    Test1()
    {
        System.out.println("Constructor call from super class");
    }
    
    void message()
    {
        System.out.println("Method call from super class");
    }
}

class Test2 extends Test1
{
    int var1 = 55;
    
    Test2()
    {
        super();   // super for calling super class CONSTRUCTOR
    }
    
    void message()
    {
        System.out.println("Method call from child class");
    }
    
    void display()
    {
        System.out.println(var1);  
        System.out.println(super.var1);   // super for calling super class VARIABLES
        
        message();
        super.message();  // super for calling super class METHODS
    }
}

public class superKeyword_Usage2
{
	public static void main(String[] args) 
	{
	    Test1 t1 = new Test1(); // calling Test1 cons. from Test1 class
            Test2 t2 = new Test2(); // calling Test1 cons. from Test2 class
            
            t2.display();
		
	}
}