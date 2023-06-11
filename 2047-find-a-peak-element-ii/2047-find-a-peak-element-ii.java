class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int strCol = 0;
        int endCol = mat[0].length-1;

        while(strCol <= endCol){
            int midCol = strCol + (endCol-strCol)/2;
            int maxRow = 0;

            for(int i = 0; i< mat.length; i++){
                maxRow = mat[maxRow][midCol] >= mat[i][midCol] ? maxRow : i;
            }

            boolean left = midCol-1 >= strCol && mat[maxRow][midCol] < mat[maxRow][midCol-1];
            boolean right = midCol+1 <= endCol && mat[maxRow][midCol] < mat[maxRow][midCol+1];

            if(!right && !left){
                return new int[]{maxRow, midCol};
            }
            else if(right){
                strCol = midCol+1;
            }else{
                endCol = midCol-1;
            }
        }
        return null;
    }
}