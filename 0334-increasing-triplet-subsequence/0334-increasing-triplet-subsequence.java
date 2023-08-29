class Solution {
    public boolean increasingTriplet(int[] str) {
       if(str.length<=2){
           return false;
       }
       
       int least = Integer.MAX_VALUE;
       int mid = Integer.MAX_VALUE;

       for(int i = 0; i<str.length; i++){
           if(str[i]>mid){
               return true;
           }
           if(str[i]>least && str[i] < mid){
               mid = str[i];
           }
           else if(str[i]<least){
               least = str[i];
           }
       }
       return false;
    }
}