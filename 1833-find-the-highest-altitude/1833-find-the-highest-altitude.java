class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int chk = 0;
        for(int i = 0; i<gain.length; i++){
            chk += gain[i];
            if(i == 0){
                if(max < chk){
                    max = gain[i];
                }
            }else{
                if(max < chk){
                    max = chk;
                }
            }
        }
        return max;
    }
}