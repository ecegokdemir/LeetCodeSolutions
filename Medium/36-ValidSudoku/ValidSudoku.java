
public class ValidSudoku {
    public static void main(String[] args) {

        // invalid because od 3x3 sub-box
        char[][] board = 
       {{'.','.','.','.','5','.','.','1','.'},
        {'.','4','.','3','.','.','.','.','.'},
        {'.','.','.','.','.','3','.','.','1'},
        {'8','.','.','.','.','.','.','2','.'},
        {'.','.','2','.','7','.','.','.','.'},
        {'.','1','5','.','.','.','.','.','.'},
        {'.','.','.','.','.','2','.','.','.'},
        {'.','2','.','9','.','.','.','.','.'},
        {'.','.','4','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(board));
        
    }

    public static boolean isValidSudoku(char[][] board) {
            
            // Check each row and column
            for (int i = 0; i < 9; i++) {
                boolean[] row = new boolean[9];
                boolean[] column = new boolean[9];
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        int num = board[i][j] - '1';
                        if (row[num]) {
                            return false;
                        }
                        row[num] = true;
                    }
                    if (board[j][i] != '.') {
                        int num = board[j][i] - '1';
                        if (column[num]) {
                            return false;
                        }
                        column[num] = true;
                    }
                }
            }
        
           
            // Check each 3x3 sub-box
            for (int k = 0; k < 9; k++) {
                boolean[] subBox = new boolean[9];
                for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
                    for (int j = k % 3 * 3; j < k % 3 * 3 + 3; j++) {
                        if (board[i][j] != '.') {
                            int num = board[i][j] - '1';
                            if (subBox[num]) {
                                return false;
                            }
                            subBox[num] = true;
                        }
                    }
                }
            }
        
            return true;
        }
        /*
         Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

        Each row must contain the digits 1-9 without repetition.
        Each column must contain the digits 1-9 without repetition.
        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
       
        Note:
        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
        Only the filled cells need to be validated according to the mentioned rules.

        Example 1:
        Input: board = 
        [["5","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]
        Output: true
        
        Example 2:
        Input: board = 
        [["8","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]
        Output: false
        Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 

        Constraints:
        board.length == 9
        board[i].length == 9
        board[i][j] is a digit 1-9 or '.'.
         */

        
}
