class Solution {

    public static int gcdLen(int a, int b){
        return b == 0 ? a : gcdLen(b, a%b);
    }

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int gcd = gcdLen(str1.length(), str2.length());
        return str1.substring(0, gcd);

    }
}