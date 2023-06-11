class Solution {

    public static boolean isPossibleChk(int[] arr, int boq, int flower, int m){
        int adj = 0, bc = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] <= m){
                adj++;
                if(adj == flower){
                    bc++;
                    if(bc == boq){
                        return true;
                    }
                    adj = 0;
                }
            }
            else{
                adj = 0;
            }
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length){
            return -1;
        }

        int low = 0, high = 0;

        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i] > high){
                high = bloomDay[i];
            }
            if(bloomDay[i] < low){
                low = bloomDay[i];
            }
        }
        int res = -1;
        while(low<= high){
            int mid = (low+high)/2;

            if(isPossibleChk(bloomDay, m, k, mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
}