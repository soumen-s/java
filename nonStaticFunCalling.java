// Program to see how to call a non-static method from the static main method

import java.util.*;

class nonStaticFunCalling
{
	int max(int x, int y) // without using static
	{
		if(x>y)
			return x;
		else
			return y;
	}

    public static void main(String[] args) 
    {
        int a=10, b=15;

        // When we dont wanna make a method static and call it from main method,
        // then we've to make an object of that main class and call it from main method.

        nonStaticFunCalling cp = new nonStaticFunCalling(); 
        System.out.print("Max is: "+cp.max(a,b));

    }
}
