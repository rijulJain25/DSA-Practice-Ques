class Solution {
    public void rotate(int[][] matrix) {
        int colLeft = 0;
        int rowTop = 0;
        int colRight = matrix.length-1;
        int rowBottom = matrix.length-1;

        while(colLeft <= colRight){
            int p1 = colLeft;
            int p2 = rowTop;
            int p3 = colRight;
            int p4 = rowBottom;
            for(int j = 0; j<colRight-colLeft; j++){
                int temp1 = matrix[rowTop][p1];
                matrix[rowTop][p1] = matrix[p4][colLeft];
                matrix[p4][colLeft] = temp1;
                
                int temp2 = matrix[p4][colLeft];
                matrix[p4][colLeft] = matrix[rowBottom][p3];
                matrix[rowBottom][p4] = temp2;

                int temp3 = matrix[rowBottom][p3];
                matrix[rowBottom][p3] = matrix[p2][colRight];
                matrix[p2][colRight] = temp3;

                p1++;
                p2++;
                p3--;
                p4--;
            }
            colLeft++;
            rowTop++;
            colRight--;
            rowBottom--;
        }
        System.gc();
    }
}