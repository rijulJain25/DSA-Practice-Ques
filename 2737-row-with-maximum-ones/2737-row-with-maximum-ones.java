class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int idx = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count> max){
                max = count;
                idx = i;
            }
            count = 0;
        }
        int arr[] = new int[2];
        arr[0] = idx;
        arr[1] = max;
        return arr;
    }
}