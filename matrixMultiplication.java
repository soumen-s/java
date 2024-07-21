// Program to implement matrix multiplication 

import java.util.*;
public class matrixMultiplication
{
    public static void matCalculate(int[][] m1, int[][] m2, int[][] res, Scanner sc)
    {
        // get the inputs of m1 matrix
        System.out.println("\nEnter the first array elements");
        for(int i=0; i<m1.length; i++)
        {
            for(int j=0; j<m1.length; j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }
        
        // get the inputs of m2 matrix
        System.out.println("\nEnter the second array elements");
        for(int i=0; i<m2.length; i++)
        {
            for(int j=0; j<m2.length; j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }
        
        // Matrix Multiplication
        for(int i=0; i<m1.length; i++)
        {
            for(int j=0; j<m2.length; j++)
            {
                for(int k=0; k<m1.length; k++)
                {
                    res[i][k] += m1[i][j] * m2[j][k];
                }
            }
        }
    }
    
    public static void printResult(int[][] res)
    {
        System.out.println("\nThe resultant matrix is: ");
		for(int i=0; i<res.length; i++)
		{
		    for(int j=0; j<res.length; j++)
		    {
		        System.out.print(res[i][j]+" ");
		    }
		  System.out.println();
		}
    }
    
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
		System.out.print("\nEnter the size of the matrices: ");
		int n = sc.nextInt();
		
		int[][] m1 = new int[n][n];
		int[][] m2 = new int[n][n];
		int[][] res = new int[n][n];
		
		matCalculate(m1,m2,res,sc);
		
		printResult(res);
		
	}
}