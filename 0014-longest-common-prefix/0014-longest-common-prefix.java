class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        char[] str = strs[0].toCharArray();
        char[] end = strs[strs.length-1].toCharArray();

        String ans = "";
        for(int i = 0; i< str.length; i++){
            if(str[i] != end[i]){
                break;
            }
            ans = ans+str[i];
        }

        return ans;
    }
}