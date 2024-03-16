// Program to implement 'this' keyword to differentiate constructor attr. & property
import java.util.*;

class rectangle
{
	int length;
	int breadth;

	rectangle(int length, int breadth)
	{                              // 'this' keyword is actually used when we use 
		this.length = length;      //  class property name and constructor attr. name same        
		this.breadth = breadth;    // -> here, [this.property_name = class_attr_name]
	}

	void display()
	{
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
}

class thisKeyword_Usage
{
	public static void main(String[] args)
	{
		rectangle r = new rectangle(12,15); //parameterized constructor

		r.display();
	}
}