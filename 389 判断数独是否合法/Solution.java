public class Solution {
    /*
     * @param board: the board
     * @return: whether the Sudoku is valid
     */
    public boolean isValidSudoku(char[][] board) {
        // write your code here
        for(int i = 0; i < board.length; i ++) {
            for(int j = 0; j < board[0].length; j ++) {
                if(board[i][j] != '.' && !checkValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkValid(char[][] board, int i, int j) {
        int tmp = board[i][j];
        //for column
        for(int c = 0; c < board[0].length; c ++) {
            if(c != i && board[c][j] == tmp) {
                return false;
            }
        }
        //for row
        for(int r = 0; r < board.length; r ++) {
            if(r != j && board[i][r] == tmp) {
                return false;
            }
        }

        int row = i / 3;
        int column = j / 3;
        for(int a = row * 3; a < row * 3 + 3; a ++) {
            for(int b = column * 3; b < column * 3 + 3; b ++) {
                if(a != i && b != j && board[a][b] == tmp) {
                    return false;
                }
            }
        }
        return true;
    }
}
