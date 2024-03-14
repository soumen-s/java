// program to calculate area and circumference of circle

import java.util.*;
class circleOperations
{
	public static void main(String arg[])
	{
		double pi = 3.14;

		System.out.print("\nEnter the radius of circle: ");
        Scanner scn = new Scanner(System.in);
        double radius = scn.nextDouble();

        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("\nThe area of that circle is: "+ area);
        System.out.println("The circumference of that circle is: "+ circumference);

	}
}