// Program to perform n-queen problem of placing the queen in a correct position

public class q5_nQueenProblem
{
    public static boolean isSafe(char board[][], int row, int col)
    {
        // vertical up column
        for(int i=row-1; i>=0; i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }
        
        // diagonal left up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        
        // diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    
    public static void printBoard(char board[][])
    {
        System.out.println("-------------- Chess Board --------------");
        for (int row=0; row<board.length; row++)
		{
		    for (int col=0; col<board.length; col++)
		    {
		        System.out.print(board[row][col]+" ");
		    }
		    System.out.println();
		}
    }
    
    public static void nQueen(char board[][], int row) // for row from 0
    {
        // base case
        if(row == board.length)
        {
            printBoard(board);
            return;
        }
        
        // for column
        for(int col=0; col<board.length; col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = 'Q';
                nQueen(board, row+1);
                board[row][col] = '.'; // to reinitialize each board after (row == board.length)
            }
        }
        
    }
    
	public static void main(String[] args) 
	{
		int n = 4;  // for n=5, 10 solutions will be there
		char[][] board = new char[n][n];  // 4x4
		
                // initialize
		for (int i=0; i<board.length; i++)
		{
		    for (int j=0; j<board.length; j++)
		    {
		        board[i][j] = '.'; // means blanck
		    }
		}
		nQueen(board, 0); 
	}
}