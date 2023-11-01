class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder str = new StringBuilder();
        int n = s.length();
        int index;
        int secondIndex;
        int diff = 2*(numRows-1);
        int digDiff = diff;
        for(int i = 0; i<numRows; i++){
            index = i;
            while(index <n){
                str.append(s.charAt(index));
                if(i != 0 && i!= numRows-1){
                    digDiff = diff- 2*i;
                    secondIndex = index + digDiff;
                    if(secondIndex < n){
                        str.append(s.charAt(secondIndex));
                    }
                }
                index+=diff;
            }
        }
        return str.toString();
    }
}