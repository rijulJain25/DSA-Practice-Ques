class Solution {
    public String reverseVowels(String s) {
        String str = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' ||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E'|| s.charAt(i) == 'I'|| s.charAt(i) == 'O'|| s.charAt(i) == 'U'){
                str = s.charAt(i)+ str;
            }
        }

        int j = 0;
        String ss = "";
        for(int i = 0; i<s.length(); i++){
            if((s.charAt(i) == 'a' ||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E'|| s.charAt(i) == 'I'|| s.charAt(i) == 'O'|| s.charAt(i) == 'U') && j<str.length()){
                ss += str.charAt(j);
                j++;
            }else{
                ss+= s.charAt(i);
            }
        }
        return ss;
    }
}