class Solution {
    public int[] replaceElements(int[] arr) {
        int array[] = new int[arr.length];
        int n = arr.length;
        if(arr.length ==1){
            array[0] = -1;
            return array;
        }
        array[n-1] = -1;
        array[n-2] = arr[n-1];
        int max = array[n-2];
        for(int i = n-2; i>=1; i--){
            max = Math.max(max, arr[i]);
            array[i-1] = max;
        }
        return array;
    }
}