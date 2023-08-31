class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int n = chars.length;
        if(n == 1){
            return 1;
        }
        while(i<n){
            int cnt = 1;
            char chara = chars[i];
            while(i+1 < n && chars[i] == chars[i+1]){
                i++;
                cnt++;
            }
            if(cnt == 1){
                chars[j++] = chara;
            }else{
                if(cnt >1){
                    chars[j++] = chara;
                    String str = cnt+"";
                    for(int k = 0; k<str.length(); k++){
                        chars[j++] =str.charAt(k);
                    }
                }
            }
            i++;
        } 
        return j;
    }
}