class Solution {
    public void rotate(int[][] matrix) {
        int columnLeft = 0;
        int rowTop = 0;
        int columnRight = matrix.length-1;
        int rowBottom = matrix.length-1;
        while(columnLeft<=columnRight){
            int p1 = columnLeft;
            int p2 = rowBottom;
            int p3 = columnRight;
            int p4 = rowTop;
            for(int j = 0; j<columnRight-columnLeft; j++){
                int temp1 = matrix[rowTop][p1];
                matrix[rowTop][p1] = matrix[p2][columnLeft];
                matrix[p2][columnLeft] = temp1;

                int temp2 = matrix[p2][columnLeft];
                matrix[p2][columnLeft] = matrix[rowBottom][p3];
                matrix[rowBottom][p3] = temp2;

                int temp3 = matrix[rowBottom][p3];
                matrix[rowBottom][p3] = matrix[p4][columnRight];
                matrix[p4][columnRight]= temp3;

                p1++;
                p2--;
                p3--;
                p4++;
            }
            columnLeft++;
            rowTop++;
            columnRight--;
            rowBottom--;
        }
    }
}