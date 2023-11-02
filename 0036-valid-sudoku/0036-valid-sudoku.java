class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set sets = new HashSet();
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] != '.'){
                    String s = "("+board[i][j]+")";
                if(!sets.add(i+s)|| !sets.add(s+j) || !sets.add(i/3+s+j/3)){
                    return false;
                }
                }
            }
        }
        return true;
    }
}