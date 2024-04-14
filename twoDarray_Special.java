// Program to perform 2D ARRAY operations with (Explained) using an another method
/*
    Here we've used another method to perform 2D array operations separately.
    That's why we can't use array size parameters(row,column)  if we pass the
    array only . The main thing here is we've used arr.length as number of 
    rows. Logically we can visualize it like for each row(i) we are inserting 
    columns(j) contionously side by side. And for any row, the column size is 
    same. That's why we've used length of arr[i] as the length of column , we
    can also use any particular row's length. 
    
*/

import java.util.*;
public class twoDarray_Special
{
    public static void twoDarrayTraverse(int[][] arr)
    {
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<arr.length; i++)  // indicates rows
        {
            System.out.print("\nEnter for row "+(i+1)+" : \n");
            for(int j=0; j<arr[i].length; j++) // indicates columns for any row (i)
            {
                System.out.print("For the row enter element "+(j+1)+" : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();    
        }
        
        System.out.println("\nThe 2D array is ~ ");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();    
        }
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter the row : ");
		int row = sc.nextInt();
		
		System.out.print("Enter the column : ");
		int column = sc.nextInt();
		
		int[][] matrix = new int[row][column];
		
		twoDarrayTraverse(matrix);
	}
}
