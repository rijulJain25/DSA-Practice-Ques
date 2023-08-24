class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        String str = "";
        int cnt = 0;
        while(i<word1.length() && j <word2.length()){
            if(cnt%2==0){
                str += word1.charAt(i);
                i++;
            }else{
                str += word2.charAt(j);
                j++;
            }
            cnt++;
        }
        if(i<word1.length()){
            str+=word1.substring(i);
        }
        else if(j<word2.length()){
            str+=word2.substring(j);
        }
        return str;
    }
}