class Solution {

    public static boolean Helper(char[][] board, String word, int index, int m, int n, int row, int col){
        if(index == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row == m || col == n || board[row][col] != word.charAt(index) || board[row][col] == '!'){
            return false;
        }

        char c = board[row][col];
        board[row][col] = '!';

        boolean top = Helper(board, word, index+1, m, n, row-1, col);
        boolean bottom = Helper(board, word, index+1, m, n, row+1, col);
        boolean right = Helper(board, word, index+1, m, n, row, col+1);
        boolean left = Helper(board, word, index+1, m, n, row, col-1);

        board[row][col] = c;

        return top || bottom || right || left;
    }

    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        int index = 0;

        // First search the first character
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == word.charAt(index)) {
                    if (Helper(board, word, index, m, n, i, j))
                        return true;
                }
            }
        }

        return false;
        
    }
}