class Solution {
public String breakPalindrome(String palindrome) {
int len = palindrome.length();
char strArr[] = palindrome.toCharArray();
for(int i=0;i<len/2;i++){
if(strArr[i] != 'a'){
strArr[i] = 'a';
return String.valueOf(strArr);
}
}
strArr[len-1] = 'b';
return len<=1?"":String.valueOf(strArr);
}
}