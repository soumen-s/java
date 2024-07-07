// Program to understand the usage of PRIVATE & PUBLIC properties

/*
    Private properties or veriables are used to maintain the privacy 
    so that it can't be accessed from out of the class. But there are
    some processes by which we can access the veriables form out of 
    the classes also. That we'll know from the encapsulation code.
*/

class calculate
{
    int a,b; // means it is also accessable from out of the class also
    private int c; // now not accessable form out of the class
    
    calculate(int x, int y)
    {
        a = x; 
        b = y; 
    }
    calculate(int x, int y, int z) // constructor overloading concept arrived
    {                              // to check private property functionality
        a = x; 
        b = y; 
        c = z;  // included that private property
    }
    
    float area1()
    {
        return 2.5f*a*b;
    }
    float area2()
    {
        return 2.5f*a*b*c;
    }
}

public class privateNpublicProperties
{
	public static void main(String[] args) 
	{
		calculate CAL1 = new calculate(2,3);
		System.out.println(CAL1.area1());
		CAL1.a = 6; // here we can use it from out of the class, no privacy
	        System.out.println(CAL1.area1());
	    
	    
	        calculate CAL2 = new calculate(2,3,5);
		System.out.println(CAL2.area2());
		//CAL2.c = 6; // but private property doesn't allows taking 
		              // accesses from out of the class it lives
		System.out.println(CAL2.area2());
	}
}
