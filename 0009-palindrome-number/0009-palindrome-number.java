class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x<=9){
            return true;
        }
        String str = Integer.toString(x);
        int high = str.length()-1;
        int low = 0;
        while(low<=high){
            if(str.charAt(low) == str.charAt(high)){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
}