class Solution {
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n];
        for(int i = 0; i<n; i++){
            arr[i] = true;
        }

        for(int i = 2; i*i<n; i++){
            if(arr[i] == true){
                for(int j = i*i; j<n; j+=i){
                    arr[j] = false;
                }
            }
        }
        int cnt = 0;
        for(int i = 2; i<n; i++){
            if(arr[i] == true){
                cnt++;
            }
        }
        return cnt;
    }
}