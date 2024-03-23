// Program to implement private class properties under public methods

import java.util.*;

class rectangle
{
	private double length;
	private double breadth;

// using setter and getter method for access or display purpose
// accessing private length and breadth

	public double getLength()
	{
		return length;
	}

	public double getBreadth()
	{
		return breadth;
	}	

	public void setLength(double sl)
	{
		length = sl;
	}

	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}

// after setting values, we're gonna perform some operations

	public double area()
	{
		return length*breadth;
	}

	public double perimeter()
	{
		return 2 * (length+breadth);
	}

	public boolean isSquare()
	{
		if(length == breadth)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class privateNpublicModifiers
{
	public static void main(String[] args)
	{
		rectangle r1 = new rectangle();
		Scanner sc = new Scanner(System.in);

		double length,width;

	    System.out.print("Enter length: ");
     	length = sc.nextDouble();
     	r1.setLength(length);

     	System.out.print("Enter breadth: ");
     	width = sc.nextDouble();   
     	r1.setBreadth(width);

     	if(r1.isSquare()) // whether the dimensions creates square or not
     	{
     		System.out.println("\nThe shape is a square");   
     	}
     	else
     	{
     		System.out.println("\nThe shape is not a square");  
     	}

     	System.out.println("Area is: " + r1.area());   
     	System.out.println("Perimeter is: " + r1.perimeter());   
	}            
}