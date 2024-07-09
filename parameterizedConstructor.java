// Program to implement PARAMETERIZED CONSTRUCTOR

class rectangle
{
    int length;
    int width;
    
	rectangle(int l, int w)  // with parameters 
	{
		length = l;
		width = w;
	}
	
	int area()
	{
	    return length*width;
	}
	
}

class parameterizedConstructor
{
	public static void main(String[] args)
	{
		rectangle r1 = new rectangle(10,12);
		System.out.print("Area: " + r1.area());
	}                                      
}