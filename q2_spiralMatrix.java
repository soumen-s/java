// Program to perform SPIRAL MATRIX problem for nXn matrix (only)

public class q2_spiralMatrix
{
    public static void spiral(int[][] arr)
    {
        // the direction indicators
        int top = 0;
        int right = arr[0].length-1;
        int bottom = arr[0].length-1;
        int left = 0;
        
        while(top <= bottom && left <= right)
        {
            // top row
            for(int i=left; i<=right; i++)
            {
                System.out.print(arr[top][i]+" ");
            }
            top++;
            
            // right column
            for(int i=top; i<=bottom; i++)
            {
                System.out.print(arr[i][right]+" ");
            }
            right--;
            
            // bottom row
            for(int i=right; i>=left; i--)
            {
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            
            // left column
            for(int i=bottom; i>=top; i--)
            {
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }    
    }
    
	public static void main(String[] args) 
	{
		int[][] matrix = {
		                     {1,2,3,4},
		                     {5,6,7,8},
		                     {9,8,7,6},
		                     {5,4,3,2}
		                 };
		spiral(matrix);                 
	}
}
