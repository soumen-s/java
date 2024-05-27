// Program to write a recursive method to find the GCD of two numbers.

/*
    36 = 2 x 2 x 3 x 3
    60 = 2 x 2 x 3 x 5    
    
    GCD = Multiple of common factors
        = 2 x 2 x 3
        = 12
*/    

public class gcdRecursive 
{

  public static int calcGCD(int num1, int num2) 
  {
    // Base case: if the num2=0, GCD is the first number
    if (num2 == 0) 
      return num1;

    int remainder = num1 % num2;
    return calcGCD(num2, remainder);
  }

  public static void main(String[] args) 
  {
    int num1 = 36;
    int num2 = 60;
    
    int gcd = calcGCD(num1, num2);
    System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
  }
}
