public class NQueens {

    // function for isSafe
    public static  boolean isSafe(char board[][], int row, int col) {
        // vertically up safe
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up safe
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up safe
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }


    public static void nQueens(char board[][],int row) {
        //column loop
        // base case of recursion
        if (row == board.length) {
            ways++;
//            display(board);
            return;

        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {

                board[row][j] = 'Q';
                nQueens(board, row + 1); // function call
                board[row][j] = 'X';  // backtracking step
            }
        }
    }

    // function to print the board
    public static void display(char board[][]){
        System.out.println("-------Chess board-------");
        for( int i=0; i< board.length;i++){
            for(int  j=0; j< board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }
    }
    // static var to find no of ways
     static int ways=0;
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        // initialize
        for(int i=0; i< n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='X';
            }

        }
        nQueens(board,0);
        System.out.println("The no of ways = "+ways);
    }

}
