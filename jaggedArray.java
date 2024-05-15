// Program to see the implementation of JAGGED ARRAY in java

/*
    A jagged array in Java is a collection of arrays(means 2D) where each 
    array may contain a varied number of elements. It's a two-dimensional 
    array, with different length of rows for each column.
*/

public class jaggedArray 
{  
    public static void main(String[] args) 
    {  
        int[][] jaggedArr = 
                                {  
                                    {11, 22, 33},  
                                    {44, 55},     
                                    {66, 77, 88, 99} 
                                };  

        System.out.println("\nThe jagged array elements are :"); 

        for (int i = 0; i < jaggedArr.length; i++) 
        {
            for (int j = 0; j < jaggedArr[i].length; j++) 
            {  
                System.out.print(jaggedArr[i][j] + " ");  
            }  
          System.out.println();  
        }  
    }  
}  