// Program to implement COPY CONSTRUCTOR (passes object through a new constructor)

/*
    In Java, copy constructors are used to create a new object as a copy of an 
    existing object. A copy constructor is a special type of constructor that 
    initializes a new object using the values from an existing object.
    
    Basically it is helpful when we want to copy a complex object that has 
    several fields, or when we want to make a deep copy of an existing object.
    
    In the cases where constructor arguments are large and where we've to make a lots of
    reference for a single solution, in that case if we've to modify any argument data,
    then this type of approach(general solution) will be too much benificial than a
    (particular sol.). Because here we've to modify only the 1st constructor.
*/

class constructor
{
    private int a;
    private int b;
    
    constructor(int x, int y)
    {
        a = x;
        b = y;
    }
    
    constructor(constructor cons)  // copying the constructor to create a new constructor 
    {                              // "cons" and copying the previous constructor values also.
        a = cons.a;
        b = cons.b;
        
        // this(cons.a, cons.b);  // or we can use it.
    }
    
    float area()
    {
        return 0.5F*a*b;
    }
}

public class copyConstructor
{
	public static void main(String[] args) 
	{
		constructor c1 = new constructor(2,3);
		//constructor c2 = new constructor(2,3); // won't be easy in case of complex data
		constructor c2 = new constructor(c1); // copy constructor
		constructor c3 = new constructor(c1);
		
	    System.out.println("constructor 1 value : " + c1.area());
	    System.out.println("constructor 2 value : " + c2.area());
	    System.out.println("constructor 3 value : " + c3.area());
	}
}