class Solution {
    public void setZeroes(int[][] matrix) {
        int dummy1[] = new int[matrix.length]; 
        int dummy2[] = new int[matrix[0].length];
        Arrays.fill(dummy1, -1);
        Arrays.fill(dummy2, -1);
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }
        }

        for(int i =0 ;i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(dummy1[i] == 0 || dummy2[j] == 0){
                    matrix[i][j] =0;
                } 
            }
        }
    }
}