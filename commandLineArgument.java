// Program to implement COMMAND LINE ARGUMENT

/*
	In main function we always pass a string array named 'args'. When we 
	pass any input, it always being considered as string in the main. 

	It's a special type of program where we provide the input during the 
	execution bypassing command directly.

	Here, from cmd, if we pass any argument of any type after compilation and
	at runtime(Ex. java commandLineArgument A 123 soumen), and if we print 
	them using a for-loop(upto args.length) or individually, then we'll see 
	the outputs at the console. 
*/

public class commandLineArgument
{
	public static void main(String[] arg)  // Run the code from command prompt
	{
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		System.out.println(arg[2]);
	}
}
