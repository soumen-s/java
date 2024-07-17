// Program to implement compile-time polymorphism

public class polymorphism_compileTime 
{
	public static int add(int a, int b)
	{
		return a + b;
	}

	public static double add(double a, double b)
	{
		return a + b;
	}

	public static void main(String args[])
	{
		// The first method called
		System.out.println(add(2, 3)); // or print Main.add(2,3)

		// The second method called
		System.out.println(add(2.0, 3.0));
	}
}
