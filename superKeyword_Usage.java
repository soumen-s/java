// Program to implement 'super' keyword for data transfer from one class to another

import java.util.*;

class parent
{
	int p1;
	int p2;
	int p3;

	parent()
	{
		p1 = p2 = p3 = 1;
		System.out.println("In parent");
	}

	parent(int x)
	{
		p3 = x;
		System.out.println("In parent - "+p3);
	}

	parent(int x, int y)
	{
		p2 = x;
		p3 = y;
		System.out.println("In parent - " + p2 + " and " + p3);
	}
}

class child extends parent
{
	int c1; //considering it has an extra amount of height as speciallity
	int c2;
	int c3;

	child()
	{
		c1 = c2 = c3 = 1;
		System.out.println("In child");
	}

	child(int x)
	{
		c3 = x;
		System.out.println("In child - " + c3);
	}

	child(int x, int y)
	{
		super(x); // the value we decided to use for parent class, can be passed
		          // through that 'super' keyword. As we passed 1 value through super, so it
		          // will catch the constructor that only has 1 arg. in parent class.

		c2 = y;  // another one we are using over there.
		System.out.println("In child - " + c2);
	}

	child(int x, int y, int z)
	{
		super(x,y); // passing two values for cons. in parent class, that has 2 args.
		c3 = z;
		System.out.println("In child - " + c3);
	}

	int total() // method(only one in the whole code)
	{
		return c1+c2+c3;
	}

}

class superKeyword_Usage
{
	public static void main(String[] args)
	{
		child c = new child(10,5,3); // here we can input values to see the func.

		System.out.println("At the end, the value is: " + c.total());
	}
}