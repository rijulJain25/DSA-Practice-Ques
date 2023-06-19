class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap < Character, Integer > mpp = new HashMap <>();
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {

            //checking it contains or not
            if (mpp.containsKey(s.charAt(right))){

                //if it contains then we will increase left by the number of times that character came 
                left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            } 

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}