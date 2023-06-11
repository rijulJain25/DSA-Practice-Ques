class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            List<Integer> ans = new ArrayList<>();
            return ans;
        }
        List<Integer> n = new ArrayList<>();
        int rowStr = 0;
        int colStr = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;

        while(rowStr <= rowEnd && colStr <= colEnd){
            for(int i = colStr; i<=colEnd; i++){
                n.add(matrix[rowStr][i]);
            }
            rowStr++;
            for(int i = rowStr; i<=rowEnd; i++){
                n.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowStr<=rowEnd){
                for(int i = colEnd; i>=colStr; i--){
                n.add(matrix[rowEnd][i]);
            }
            }
            rowEnd--;

            if(colStr<=colEnd){
                for(int i = rowEnd; i>=rowStr; i--){
                    n.add(matrix[i][colStr]);
                }
            }
            colStr++;
        }
        return n;
    }
}