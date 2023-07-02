class Solution {

    public static void solve(int col, char[][] board, List<List<String>> res, int[] leftRow, int[] upperDiag, int[] lowerDiag){
        if(col == board.length){
            res.add(construct(board));
            return;
        }

        for(int row = 0; row<board.length; row++){
            if(leftRow[row] == 0 && upperDiag[row+col] == 0 && lowerDiag[board.length -1 +col-row] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                upperDiag[row+col] = 1;
                lowerDiag[board.length -1 +col-row] = 1;
                solve(col+1, board, res, leftRow, upperDiag, lowerDiag);
                board[row][col] = '.';
                leftRow[row] = 0;
                upperDiag[row+col] = 0;
                lowerDiag[board.length -1 +col-row] = 0;
            }
        }
    }

    public static List<String> construct(char[][] board){
        List<String> str = new ArrayList<>();
        for(int i = 0; i<board.length; i++){
            String s= new String(board[i]);
            str.add(s);
        }
        return str;
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        int leftRow[] = new int[n];
        int upperDiag[] = new int[2*n-1];
        int lowerDiag[] = new int[2*n-1];
        solve(0, board, res, leftRow, upperDiag, lowerDiag);
        return res;
        
    }
}