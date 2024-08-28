// Program to check how to pass object in the form of argument

/*
    here, inside fun2, (this.fun) is not required as fun is also belonging 
    from same class but to clarify it's argument, which is nothing but 
    an object, 'this' is required inside the bracket. but it is not for
    normal static datatyped arguments.
*/

class test
{
    int a,b;
    void fun(test x)
    {
        System.out.println(x.a + " and " + x.b);
    }
    
    void fun2()
    {
        this.fun(this); // only applicable while passing 'object' as an argument
    }                  
}

public class this_objectCall
{
	public static void main(String[] args) 
	{
	    int a,b;
            test t = new test();
            t.a = 10;
            t.b = 20;
            
            t.fun(t); // that's how we can pass objects as a reference**
            
            t.fun2();  // or directly these one
	}
}