// Program to perform object creation 

// We make class objects or references so that we can use it's methods or properties
// or constructors

import java.util.*;

class circle // will be accessed from main class
{
	double radius; // property

	public double area() // method
	{
		return Math.PI * radius * radius;
	}

	public double circumference() // method
	{
		return 2 * Math.PI * radius;
	}

	public double perimeter() // method 
	{
		return circumference(); 
	}
}

class objectCreation
{
	
    public static void main(String[] args) 
    {   
     	circle c1 = new circle();
     	// we can make different objects under a class (c2,c3 and so on)
     	// there for every different objects of circle class, 3 methods will present
     	// here we declare one property that is used in diff. methods in diff. way

     	System.out.print("Enter radius: ");
     	Scanner sc = new Scanner(System.in);
     	c1.radius = sc.nextDouble();

     	System.out.println("The area of the circle is: " + c1.area());
     	System.out.println("The Circumference of the circle is: " + c1.circumference());
     	System.out.println("The Perimeter of the circle is: " + c1.perimeter());
    }                                   
}