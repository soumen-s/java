// Program to implement DEFAULT CONSTRUCTOR

/*
	This constructor is called whenever we will provide it in the code or even if we
	don't provide it, at the time of object creation. When we dont provide the 
        constructor structure in the code, then the compiler will automatically create
        a default constructor.
*/

class rectangle
{
        int length;
        int width;
    
	rectangle(int l, int w)
	{
		length = l;
		width = w;
	}
	
	rectangle()
	{
	    System.out.print("Default constructor called.");
	}
	
	int area()
	{
	    return length*width;
	}
	
}

class defaultConstructor
{
	public static void main(String[] args)
	{
		rectangle r1 = new rectangle();  // default constructor invocked
		
		rectangle r1 = new rectangle(10,5);  // parameterized constructor invocked
	}                                      
}